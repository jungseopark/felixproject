package name.felix.commons.code.web;

import javax.annotation.Resource;

import name.felix.commons.code.service.NationCodeManageService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NationCodeManageController {

	private static Logger logger = LoggerFactory.getLogger(NationCodeManageController.class);

	@Resource(name = "NationCodeManageService")
	NationCodeManageService nationCodeManageService;

	@RequestMapping(value = "/commons/code/NationCodeList.do")
	public String selectNationCodeList(ModelMap model) throws Exception {
		return "commons/code/NationCodeList";
	}

	@RequestMapping(value = "/commons/code/NationCodeDetail.do")
	public String selectNationCodeDetail(ModelMap model) throws Exception {
		return "commons/code/NationCodeDetail";
	}

	@RequestMapping(value = "/commons/code/NationCodeRegist.do")
	public String insertNationCode(ModelMap model) throws Exception {
		return "forward:/commons/NationCodeDetail.do";
	}

	@RequestMapping(value = "/commons/code/NationCodeModify.do")
	public String updateNationCode(ModelMap model) throws Exception {
		return "forward:/common/code/NationCodeDetail.do";
	}

	@RequestMapping(value = "/commons/code/NationCodeRemove.do")
	public String deleteNationCode(ModelMap model) throws Exception {
		return "forward:/commons/code/NationCodeList.do";
	}

}
