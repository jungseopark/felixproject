package kr.pe.felixproject.core.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.pe.felixproject.api.service.WebLog;
import kr.pe.felixproject.core.FelixAbstractServiceImpl;
import kr.pe.felixproject.core.service.WebLogService;
import kr.pe.felixproject.core.service.WebLogVO;

import org.springframework.stereotype.Service;

@Service("WebLogService")
public class WebLogServiceImpl extends FelixAbstractServiceImpl implements WebLogService {

	@Resource(name = "WebLogDAO")
	WebLogMapper webLogDAO;

	public void insertWebLog(WebLog vo) throws Exception {
		webLogDAO.insertWebLog(vo);
	}

	public List<WebLogVO> selectWebLogList(WebLogVO vo) throws Exception {
		return webLogDAO.selectWebLogList(vo);
	}

}
