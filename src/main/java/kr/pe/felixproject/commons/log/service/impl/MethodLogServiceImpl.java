package kr.pe.felixproject.commons.log.service.impl;

import javax.annotation.Resource;

import kr.pe.felixproject.commons.log.service.MethodLog;
import kr.pe.felixproject.commons.log.service.MethodLogService;
import kr.pe.felixproject.core.service.impl.FelixAbstractServiceImpl;

import org.springframework.stereotype.Service;

@Service("MethodLogService")
public class MethodLogServiceImpl extends FelixAbstractServiceImpl implements MethodLogService {

	@Resource(name="MethodLogDAO")
	MethodLogMapper methodLogDAO;
	
	public void logInsertMethodLog(MethodLog vo) throws Exception {
		methodLogDAO.logInsertMethodLog(vo);
	}

}
