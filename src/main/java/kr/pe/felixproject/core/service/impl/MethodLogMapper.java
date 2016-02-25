package kr.pe.felixproject.core.service.impl;

import kr.pe.felixproject.core.service.MethodLogVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("MethodLogDAO")
public interface MethodLogMapper {
	
	public void logInsertMethodLog(MethodLogVO vo);

}
