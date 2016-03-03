package kr.pe.felixproject.api.web;

import java.util.List;

import javax.annotation.Resource;

import kr.pe.felixproject.core.service.WebLogService;
import kr.pe.felixproject.core.service.WebLogVO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebLogManageController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "WebLogService")
	WebLogService webLogService;

	@RequestMapping(value = "/api/firstWebLogList.do")
	public String selectWebLogList(@ModelAttribute("SearchVO") WebLogVO searchVO, ModelMap model) throws Exception {
		List<WebLogVO> result = webLogService.selectWebLogList(searchVO);
		logger.debug(" ### List Size : {}", result.size());
		model.addAttribute("resultList", result);
		return "/api/webLogView";
	}

}
