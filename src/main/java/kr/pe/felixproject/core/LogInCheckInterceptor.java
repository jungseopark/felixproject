package kr.pe.felixproject.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LogInCheckInterceptor extends HandlerInterceptorAdapter {

	private Logger Log = Logger.getLogger(this.getClass());

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		Boolean isAuthenticated = FelixUserDetailsHelper.isAuthenticated();
		
		String requestUri = request.getRequestURI();
		
		if(StringUtils.contains(requestUri, "/common/logInPageView.do")) {
			return true;
		}
		
		if (!isAuthenticated) {
			Log.debug("Not LogIn");
			response.sendRedirect(request.getContextPath() + "/");
			return false;
		}

		return true;
	}

}