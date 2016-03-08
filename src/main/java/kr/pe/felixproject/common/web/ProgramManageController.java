package kr.pe.felixproject.common.web;

import javax.annotation.Resource;

import kr.pe.felixproject.common.service.ProgramManageService;
import kr.pe.felixproject.common.service.ProgramVO;
import kr.pe.felixproject.core.FelixAbstractController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProgramManageController extends FelixAbstractController {

	@Resource(name = "ProgramManageService")
	ProgramManageService programManageService;

	@RequestMapping(value = "/common/programListView.do")
	public String firstProgramList(@ModelAttribute("searchVO") ProgramVO searchVO, ModelMap model) throws Exception {
		return "/common/programList";
	}
}
