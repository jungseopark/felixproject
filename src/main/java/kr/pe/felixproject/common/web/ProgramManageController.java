package kr.pe.felixproject.common.web;

import javax.annotation.Resource;

import kr.pe.felixproject.common.service.ProgramManageService;
import kr.pe.felixproject.common.service.ProgramVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProgramManageController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "ProgramManageService")
	ProgramManageService programManageService;

	@RequestMapping(value = "/common/programListView.do")
	public String firstProgramList(@ModelAttribute("searchVO") ProgramVO searchVO, ModelMap model) throws Exception {
		return "/common/programList";
	}
}
