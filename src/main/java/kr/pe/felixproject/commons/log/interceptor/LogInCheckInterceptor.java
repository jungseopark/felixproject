package kr.pe.felixproject.commons.log.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.pe.felixproject.core.session.FelixUserDetailsHelper;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LogInCheckInterceptor extends HandlerInterceptorAdapter {

	private Logger Logger = LoggerFactory.getLogger(this.getClass());

	private static final String[] EXCLUDE_URI = { "/common/logInPageView.do", "/common/actionLogIn.do" };

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		Boolean isAuthenticated = FelixUserDetailsHelper.isAuthenticated();

		String requestUri = request.getRequestURI();
		
		/**
		 * 로그인 체크가 필요없는 uri 는 바로 패스 시킨다
		 */
		if (StringUtils.containsAny(requestUri, EXCLUDE_URI)) {
			return true;
		}
		
		/**
		 * 세션 생성 여부를 확인해서 세션이 없는 경우는 초기화면으로 이동
		 */
		if (!isAuthenticated) {
			Logger.debug("Not LogIn");
			response.sendRedirect(request.getContextPath() + "/");
			return false;
		}

		return true;
	}

}
