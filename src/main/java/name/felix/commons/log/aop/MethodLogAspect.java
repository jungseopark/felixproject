package name.felix.commons.log.aop;

import javax.annotation.Resource;

import name.felix.commons.log.service.MethodLog;
import name.felix.commons.log.service.MethodLogService;
import name.felix.core.session.SessionVO;
import name.felix.core.session.UserDetailsHelper;

import org.aspectj.lang.ProceedingJoinPoint;

public class MethodLogAspect {

	@Resource(name = "MethodLogService")
	MethodLogService methodLogService;

	public Object logInsertMethodLog(ProceedingJoinPoint joinPoint) throws Throwable {

		String staffNo = "guest";
		String ipAddress = UserDetailsHelper.getIpAddress();

		Boolean isAuthenticated = UserDetailsHelper.isAuthenticated();
		if (isAuthenticated) {
			SessionVO session = (SessionVO) UserDetailsHelper.getAuthenticatedUser();
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
