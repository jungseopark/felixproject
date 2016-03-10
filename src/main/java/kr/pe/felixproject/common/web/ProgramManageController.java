package kr.pe.felixproject.common.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import kr.pe.felixproject.common.service.Program;
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

	/**
	 * 프로그램 목록 첫화면
	 * @param searchVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/common/programListView.do")
	public String firstProgramList(@ModelAttribute("searchVO") ProgramVO searchVO, ModelMap model) throws Exception {
		List<ProgramVO> resultList = new ArrayList<ProgramVO>();
		model.addAttribute("resultList", resultList);
		return "/common/programList";
	}

	/**
	 * 프로그램 목록 조회
	 * @param searchVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/common/selectProgramList.do")
	public String selectProgramList(@ModelAttribute("searchVO") ProgramVO searchVO, ModelMap model) throws Exception {
		List<ProgramVO> resultList = programManageService.selectProgramList(searchVO);
		model.addAttribute("resultList", resultList);
		return "/common/programList";
	}

	/**
	 * 프로그램 목록 상세 조회
	 * @param searchVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/common/selectProgram.do")
	public String selectProgram(@ModelAttribute("searchVO") ProgramVO searchVO, ModelMap model) throws Exception {
		return "/common/programInquiry";
	}

	/**
	 * 프로그램 신규 화면으로 이동
	 * @param searchVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/common/addProgram.do")
	public String addProgram(@ModelAttribute("searchVO") ProgramVO searchVO, ModelMap model) throws Exception {
		return "/common/programRegist";
	}

	/**
	 * 프로그램 신규 저장
	 * @param searchVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/common/insertProgram.do")
	public String insertProgram(@ModelAttribute("searchVO") ProgramVO searchVO, @ModelAttribute("program") Program program, ModelMap model) throws Exception {
		programManageService.insertProgram(program);
		return "forward:/common/selectProgram.do";
	}

	/**
	 * 프로그램 수정 화면으로 이동
	 * @param searchVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/common/forUpdateProgram.do")
	public String selectProgramForUpdate(@ModelAttribute("searchVO") ProgramVO searchVO, ModelMap model) throws Exception {
		return "/common/programUpdate";
	}

	/**
	 * 프로그램 수정저장
	 * @param searchVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/common/updateProgram.do")
	public String updateProgram(@ModelAttribute("searchVO") ProgramVO searchVO, ModelMap model) throws Exception {
		return "forward:/common/programInquiry";
	}

}
