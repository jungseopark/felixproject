package kr.pe.felixproject.common.service;

import java.util.List;

public interface WebLogService {

	List<WebLogVO> selectWebLogList(WebLogVO vo) throws Exception;

	void insertWebLog(WebLog vo) throws Exception;

}