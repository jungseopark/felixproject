package kr.pe.felixproject.common.service.impl;

import kr.pe.felixproject.common.service.LogInOutVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("LogInOutDAO")
public interface LogInOutMapper {

	public String encryptPassword(String password);

	public LogInOutVO actionLogIn(LogInOutVO vo);

}
