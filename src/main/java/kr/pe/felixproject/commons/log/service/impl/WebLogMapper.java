package kr.pe.felixproject.commons.log.service.impl;

import java.util.List;

import kr.pe.felixproject.commons.log.service.WebLog;
import kr.pe.felixproject.commons.log.service.WebLogVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("WebLogDAO")
public interface WebLogMapper {

	public List<WebLogVO> selectWebLogList(WebLogVO vo);

	public void insertWebLog(WebLog vo);

}
