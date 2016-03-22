package kr.pe.felixproject.commons.auth.service.impl;

import java.util.List;

import kr.pe.felixproject.commons.auth.service.Program;
import kr.pe.felixproject.commons.auth.service.ProgramVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("ProgramManageDAO")
public interface ProgramManageMapper {

	public List<ProgramVO> selectProgramList(ProgramVO vo);

	public void insertProgram(Program vo);
	
	public void updateProgram(Program vo);

}
