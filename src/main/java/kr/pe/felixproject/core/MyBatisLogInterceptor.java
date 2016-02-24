package kr.pe.felixproject.core;

import java.sql.Statement;
import java.util.Properties;

import kr.pe.felixproject.core.service.SessionVO;

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

	public Object intercept(Invocation invocation) throws Throwable {
		StatementHandler handler = (StatementHandler) invocation.getTarget();
		String query = handler.getBoundSql().getSql();
		String param = "";

		if (handler.getParameterHandler().getParameterObject() != null) {
			param = handler.getParameterHandler().getParameterObject().toString();
		}

		if (FelixUserDetailsHelper.isAuthenticated()) {
			SessionVO sessionVO = (SessionVO) FelixUserDetailsHelper.getAuthenticatedUser();
			MDC.put("userId", sessionVO.getUserId());
		} else {
			MDC.put("userId", "NOT LOG IN");
		}
		
		
		
		return invocation.proceed();
	}

	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	public void setProperties(Properties properties) {
	}

}
