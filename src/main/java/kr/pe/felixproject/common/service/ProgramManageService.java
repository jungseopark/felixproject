package kr.pe.felixproject.common.service;

import java.util.List;

public interface ProgramManageService {
	
	List<ProgramVO> selectProgramList(ProgramVO vo) throws Exception;
	
	void insertProgram(Program vo) throws Exception;

}
