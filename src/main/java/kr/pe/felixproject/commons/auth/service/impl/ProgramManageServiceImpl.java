package kr.pe.felixproject.commons.auth.service.impl;

import java.util.List;

import javax.annotation.Resource;

import kr.pe.felixproject.commons.auth.service.Program;
import kr.pe.felixproject.commons.auth.service.ProgramManageService;
import kr.pe.felixproject.commons.auth.service.ProgramVO;
import kr.pe.felixproject.core.service.impl.FelixAbstractServiceImpl;

import org.springframework.stereotype.Service;

@Service("ProgramManageService")
public class ProgramManageServiceImpl extends FelixAbstractServiceImpl implements ProgramManageService {

	@Resource(name = "ProgramManageDAO")
	ProgramManageMapper programManageMapper;

	public List<ProgramVO> selectProgramList(ProgramVO vo) throws Exception {
		return programManageMapper.selectProgramList(vo);
	}

	public void insertProgram(Program vo) throws Exception {
		programManageMapper.insertProgram(vo);
	}

	public void updateProgram(Program vo) throws Exception {
		programManageMapper.updateProgram(vo);
	}

}
