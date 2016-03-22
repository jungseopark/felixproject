package name.felix.commons.log.interceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import name.felix.commons.log.service.WebLog;
import name.felix.commons.log.service.WebLogService;
import name.felix.core.session.SessionVO;
import name.felix.core.session.UserDetailsHelper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class WebLogInterceptor extends HandlerInterceptorAdapter {

	private Logger Logger = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "WebLogService")
	WebLogService webLogService;

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

		WebLog vo = new WebLog();
		String staffNo = "guest";

		Boolean isAuthenticated = UserDetailsHelper.isAuthenticated();
		if (isAuthenticated) {
			SessionVO session = (SessionVO) UserDetailsHelper.getAuthenticatedUser();
			staffNo = session.getStaffNo();
		}

		vo.setStaffNo(staffNo);
		vo.setUrl(request.getRequestURI());
		vo.setIpAddress(request.getRemoteAddr());

		webLogService.insertWebLog(vo);
	}

}
