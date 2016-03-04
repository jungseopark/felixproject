package kr.pe.felixproject.common.service.impl;

import kr.pe.felixproject.common.service.MethodLog;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("MethodLogDAO")
public interface MethodLogMapper {
	
	public void logInsertMethodLog(MethodLog vo);

}
