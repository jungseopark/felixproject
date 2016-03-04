package kr.pe.felixproject.common.service.impl;

import java.util.List;

import kr.pe.felixproject.common.service.WebLog;
import kr.pe.felixproject.common.service.WebLogVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("WebLogDAO")
public interface WebLogMapper {

	public List<WebLogVO> selectWebLogList(WebLogVO vo);

	public void insertWebLog(WebLog vo);

}
