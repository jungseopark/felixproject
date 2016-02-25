package kr.pe.felixproject.core.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.pe.felixproject.core.FelixAbstractServiceImpl;
import kr.pe.felixproject.core.service.WebLogService;
import kr.pe.felixproject.core.service.WebLogVO;

@Service("WebLogService")
public class WebLogServiceImpl extends FelixAbstractServiceImpl implements WebLogService {

	@Resource(name="WebLogDAO")
	WebLogMapper webLogDAO;
	
	public void insertWebLog(WebLogVO vo) throws Exception {
		webLogDAO.insertWebLog(vo);
	}

}
