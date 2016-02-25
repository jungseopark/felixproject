package kr.pe.felixproject.core;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.pe.felixproject.core.service.SessionVO;
import kr.pe.felixproject.core.service.WebLogService;
import kr.pe.felixproject.core.service.WebLogVO;

import org.apache.log4j.MDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class WebLogInterceptor extends HandlerInterceptorAdapter {

	private Logger Logger = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "WebLogService")
	WebLogService webLogService;

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

		WebLogVO webLog = new WebLogVO();
		String staffNo = "guest";

		Boolean isAuthenticated = FelixUserDetailsHelper.isAuthenticated();
		if (isAuthenticated) {
			SessionVO session = (SessionVO) FelixUserDetailsHelper.getAuthenticatedUser();
			staffNo = session.getStaffNo();
		}

		webLog.setStaffNo(staffNo);
		webLog.setUrl(request.getRequestURI());
		webLog.setIpAddress(request.getRemoteAddr());

		webLogService.insertWebLog(webLog);
	}

}
