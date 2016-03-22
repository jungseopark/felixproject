package kr.pe.felixproject.commons.auth.service;

import java.util.List;

public interface ProgramManageService {
	
	List<ProgramVO> selectProgramList(ProgramVO vo) throws Exception;
	
	void insertProgram(Program vo) throws Exception;
	
	void updateProgram(Program vo) throws Exception;

}
