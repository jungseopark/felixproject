package kr.pe.felixproject.common.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import kr.pe.felixproject.common.service.WebLogService;
import kr.pe.felixproject.common.service.WebLogVO;
import kr.pe.felixproject.core.FelixAbstractController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebLogManageController extends FelixAbstractController {

	@Resource(name = "WebLogService")
	WebLogService webLogService;

	@RequestMapping(value = "/common/firstWebLogList.do")
	public String selectWebLogList(@ModelAttribute("SearchVO") WebLogVO searchVO, ModelMap model) throws Exception {
		List<WebLogVO> result = webLogService.selectWebLogList(searchVO);
		logger.debug(" ### List Size : {}", result.size());
		model.addAttribute("resultList", result);
		return "/common/webLogView";
	}

	@RequestMapping(value = "/common/firstWebLogListJSON.do")
	public String firstWebLogListJSON(@ModelAttribute("SearchVO") WebLogVO searchVO, ModelMap model) throws Exception {
		return "/common/webLogViewJSON";
	}

	@RequestMapping(value = "/common/selectWebLogListJSON.do")
	@ResponseBody
	public Object selectWebLogListJSON(@ModelAttribute("SearchVO") WebLogVO searchVO, ModelMap model) throws Exception {
		List<WebLogVO> result = webLogService.selectWebLogList(searchVO);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("data", result);
		return map;
	}

}
