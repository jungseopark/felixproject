package kr.pe.felixproject.commons.log.interceptor;

import java.sql.Statement;
import java.util.Properties;

import kr.pe.felixproject.core.session.FelixUserDetailsHelper;
import kr.pe.felixproject.core.session.SessionVO;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.log4j.MDC;

@Intercepts({ @Signature(type = StatementHandler.class, method = "query", args = { Statement.class, ResultHandler.class }),
		@Signature(type = StatementHandler.class, method = "update", args = { Statement.class }) })
public class MyBatisLogInterceptor implements Interceptor {

	/**
	 * sql log를 db로 저장할때, log4j2.xml에서 필요한 정보를 생성하는 메소드.
	 * myBatis 실행전에 인터셉터 해서 정보를 생성한 후, MDC를 이용하여 log4j2.xml로 전달한다.
	 */
	public Object intercept(Invocation invocation) throws Throwable {
		if (FelixUserDetailsHelper.isAuthenticated()) {
			SessionVO sessionVO = (SessionVO) FelixUserDetailsHelper.getAuthenticatedUser();
			MDC.put("staffNo", sessionVO.getStaffNo());
		} else {
			MDC.put("staffNo", "guest");
		}
		
		MDC.put("ipAddress", FelixUserDetailsHelper.getIpAddress());
		
		return invocation.proceed();
	}

	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	public void setProperties(Properties properties) {
	}

}
