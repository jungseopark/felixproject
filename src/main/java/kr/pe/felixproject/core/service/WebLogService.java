package kr.pe.felixproject.core.service;

import java.util.List;

import kr.pe.felixproject.api.service.WebLog;

public interface WebLogService {

	List<WebLogVO> selectWebLogList(WebLogVO vo) throws Exception;

	void insertWebLog(WebLog vo) throws Exception;

}
