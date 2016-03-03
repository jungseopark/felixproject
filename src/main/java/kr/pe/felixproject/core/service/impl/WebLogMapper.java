package kr.pe.felixproject.core.service.impl;

import java.util.List;

import kr.pe.felixproject.api.service.WebLog;
import kr.pe.felixproject.core.service.WebLogVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("WebLogDAO")
public interface WebLogMapper {

	public List<WebLogVO> selectWebLogList(WebLogVO vo);

	public void insertWebLog(WebLog vo);

}
