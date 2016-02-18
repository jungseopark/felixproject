package kr.pe.felixproject.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

public class FelixUserDetailsHelper {

	public static Object getAuthenticatedUser() {
		return RequestContextHolder.getRequestAttributes().getAttribute("SessionVO", RequestAttributes.SCOPE_SESSION);
	}

	public List<String> getAuthorities() {

		List<String> listAuth = new ArrayList<String>();

		return listAuth;
	}

	public static Boolean isAuthenticated() {

		if (RequestContextHolder.getRequestAttributes() == null) {
			return false;
		} else {

			if (RequestContextHolder.getRequestAttributes().getAttribute("SessionVO", RequestAttributes.SCOPE_SESSION) == null) {
				return false;
			} else {
				return true;
			}
		}

	}

}
