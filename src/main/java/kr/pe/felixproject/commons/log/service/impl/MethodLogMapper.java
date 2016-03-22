package kr.pe.felixproject.commons.log.service.impl;

import kr.pe.felixproject.commons.log.service.MethodLog;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("MethodLogDAO")
public interface MethodLogMapper {
	
	public void logInsertMethodLog(MethodLog vo);

}
