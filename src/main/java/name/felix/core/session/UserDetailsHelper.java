package name.felix.core.session;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class UserDetailsHelper {

	public static Object getAuthenticatedUser() {
		return RequestContextHolder.getRequestAttributes().getAttribute("sessionVO", RequestAttributes.SCOPE_SESSION);
	}

	public List<String> getAuthorities() {

		List<String> listAuth = new ArrayList<String>();

		return listAuth;
	}

	public static Boolean isAuthenticated() {

		if (RequestContextHolder.getRequestAttributes() == null) {
			return false;
		} else {
			if (RequestContextHolder.getRequestAttributes().getAttribute("sessionVO", RequestAttributes.SCOPE_SESSION) == null) {
				return false;
			} else {
				return true;
			}
		}

	}

	public static String getIpAddress() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		return request.getRemoteAddr();

	}

}
