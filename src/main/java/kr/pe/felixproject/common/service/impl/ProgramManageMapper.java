package kr.pe.felixproject.common.service.impl;

import java.util.List;

import kr.pe.felixproject.common.service.Program;
import kr.pe.felixproject.common.service.ProgramVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("ProgramManageDAO")
public interface ProgramManageMapper {

	public List<ProgramVO> selectProgramList(ProgramVO vo);

	public void insertProgram(Program vo);

}
