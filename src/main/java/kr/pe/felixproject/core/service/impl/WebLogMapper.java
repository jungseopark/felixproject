package kr.pe.felixproject.core.service.impl;

import kr.pe.felixproject.core.service.WebLogVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("WebLogDAO")
public interface WebLogMapper {
	
	public void insertWebLog(WebLogVO vo);

}
