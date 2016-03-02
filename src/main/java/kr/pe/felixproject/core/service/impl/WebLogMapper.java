package kr.pe.felixproject.core.service.impl;

import kr.pe.felixproject.api.service.WebLog;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("WebLogDAO")
public interface WebLogMapper {

	public void insertWebLog(WebLog vo);

}
