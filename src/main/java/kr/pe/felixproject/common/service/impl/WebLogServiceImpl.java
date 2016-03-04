package kr.pe.felixproject.common.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.pe.felixproject.common.service.WebLog;
import kr.pe.felixproject.common.service.WebLogService;
import kr.pe.felixproject.common.service.WebLogVO;
import kr.pe.felixproject.core.FelixAbstractServiceImpl;

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
