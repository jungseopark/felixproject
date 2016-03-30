package name.felix.commons.code.web;

import javax.annotation.Resource;

import name.felix.commons.code.service.NationCodeManageService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

@Controller
public class NationCodeManageController {

	private static Logger logger = LoggerFactory.getLogger(NationCodeManageController.class);

	@Resource(name = "NationCodeManageService")
	NationCodeManageService nationCodeManageService;
	
	public String selectNationCodeList(ModelMap model) throws Exception {
		return null;
	}
	
	public String selectNationCodeDetail(ModelMap model) throws Exception {
		return null;
	}
	
	public String insertNationCode(ModelMap model) throws Exception {
		return null;
	}
	
	public String updateNationCode(ModelMap model) throws Exception {
		return null;
	}
	
	public String deleteNationCode(ModelMap model) throws Exception {
		return null;
	}

}
