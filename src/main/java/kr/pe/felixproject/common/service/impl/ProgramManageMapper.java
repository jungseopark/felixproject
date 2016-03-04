package kr.pe.felixproject.common.service.impl;

import kr.pe.felixproject.common.service.Program;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("ProgramManageDAO")
public interface ProgramManageMapper {

	public void insertProgram(Program vo);

}
