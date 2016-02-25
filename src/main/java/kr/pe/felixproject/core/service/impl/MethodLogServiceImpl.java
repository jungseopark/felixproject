package kr.pe.felixproject.core.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.pe.felixproject.core.FelixAbstractServiceImpl;
import kr.pe.felixproject.core.service.MethodLogService;
import kr.pe.felixproject.core.service.MethodLogVO;

@Service("MethodLogService")
public class MethodLogServiceImpl extends FelixAbstractServiceImpl implements MethodLogService {

	@Resource(name="MethodLogDAO")
	MethodLogMapper methodLogDAO;
	
	public void logInsertMethodLog(MethodLogVO vo) throws Exception {
		methodLogDAO.logInsertMethodLog(vo);
	}

}
