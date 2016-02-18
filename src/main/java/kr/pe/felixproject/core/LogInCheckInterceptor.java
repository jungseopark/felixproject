package kr.pe.felixproject.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LogInCheckInterceptor extends HandlerInterceptorAdapter {

	private Logger Log = Logger.getLogger(this.getClass());

	private static final String[] EXCLUDE_URI = { "/common/logInPageView.do", "/common/actionLogIn.do" };

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		Boolean isAuthenticated = FelixUserDetailsHelper.isAuthenticated();

		String requestUri = request.getRequestURI();
		
		if (StringUtils.containsAny(requestUri, EXCLUDE_URI)) {
			return true;
		}
		
		if (!isAuthenticated || !StringUtils.containsAny(requestUri, EXCLUDE_URI)) {
			Log.debug("Not LogIn");
			response.sendRedirect(request.getContextPath() + "/");
			return false;
		}

		return true;
	}

}
