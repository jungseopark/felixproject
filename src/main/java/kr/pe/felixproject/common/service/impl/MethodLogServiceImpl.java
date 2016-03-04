package kr.pe.felixproject.common.service.impl;

import javax.annotation.Resource;

import kr.pe.felixproject.common.service.MethodLog;
import kr.pe.felixproject.common.service.MethodLogService;
import kr.pe.felixproject.core.FelixAbstractServiceImpl;

import org.springframework.stereotype.Service;

@Service("MethodLogService")
public class MethodLogServiceImpl extends FelixAbstractServiceImpl implements MethodLogService {

	@Resource(name="MethodLogDAO")
	MethodLogMapper methodLogDAO;
	
	public void logInsertMethodLog(MethodLog vo) throws Exception {
		methodLogDAO.logInsertMethodLog(vo);
	}

}
