package kr.pe.felixproject.core.service;

import javax.servlet.http.HttpServletRequest;

public class ClientInformation {

	public static String getClientIp(HttpServletRequest request) throws Exception {
		String ipAddress = request.getRemoteAddr();
		return ipAddress;
	}

}
