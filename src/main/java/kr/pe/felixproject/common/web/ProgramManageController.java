package kr.pe.felixproject.common.web;

import javax.annotation.Resource;

import kr.pe.felixproject.common.service.ProgramManageService;

import org.springframework.stereotype.Controller;

@Controller
public class ProgramManageController {

	@Resource(name = "ProgramManageService")
	ProgramManageService programManageService;
}
