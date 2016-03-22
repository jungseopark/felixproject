package kr.pe.felixproject.commons.log.aop;

import javax.annotation.Resource;

import kr.pe.felixproject.commons.log.service.MethodLog;
import kr.pe.felixproject.commons.log.service.MethodLogService;
import kr.pe.felixproject.core.session.FelixUserDetailsHelper;
import kr.pe.felixproject.core.session.SessionVO;

import org.aspectj.lang.ProceedingJoinPoint;

public class MethodLogAspect {

	@Resource(name = "MethodLogService")
	MethodLogService methodLogService;

	public Object logInsertMethodLog(ProceedingJoinPoint joinPoint) throws Throwable {

		String staffNo = "guest";
		String ipAddress = FelixUserDetailsHelper.getIpAddress();

		Boolean isAuthenticated = FelixUserDetailsHelper.isAuthenticated();
		if (isAuthenticated) {
			SessionVO session = (SessionVO) FelixUserDetailsHelper.getAuthenticatedUser();
			staffNo = session.getStaffNo();
			ipAddress = session.getIpAddress();
		}

		MethodLog vo = new MethodLog();
		vo.setClassName(joinPoint.getTarget().getClass().getName());
		vo.setMethodName(joinPoint.getSignature().getName());
		vo.setIpAddress(ipAddress);
		vo.setStaffNo(staffNo);

		methodLogService.logInsertMethodLog(vo);

		return joinPoint.proceed();
	}

}
