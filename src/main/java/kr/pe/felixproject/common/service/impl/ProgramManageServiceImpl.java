package kr.pe.felixproject.common.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.pe.felixproject.common.service.ProgramManageService;
import kr.pe.felixproject.core.FelixAbstractServiceImpl;

@Service("ProgramManageService")
public class ProgramManageServiceImpl extends FelixAbstractServiceImpl implements ProgramManageService {

	@Resource(name = "ProgramManageDAO")
	ProgramManageMapper programManageMapper;

}
