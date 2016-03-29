package name.felix.commons.auth.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import name.felix.commons.auth.service.MenuService;
import name.felix.commons.auth.service.MenuVO;
import name.felix.core.session.SessionVO;
import name.felix.core.session.UserDetailsHelper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuController {

	private static Logger logger = LoggerFactory.getLogger(MenuController.class);

	@Resource(name = "MenuService")
	MenuService menuService;

	@RequestMapping(value = "/commons/auth/selectSecondMenuList.do")
	@ResponseBody
	public Object selectSecondMenuList(@ModelAttribute("searchVO") MenuVO searchVO) throws Exception {
		String searchUserId = ((SessionVO) UserDetailsHelper.getAuthenticatedUser()).getUserId();
		searchVO.setSearchUserId(searchUserId);
		List<MenuVO> result = menuService.selectTopMenuListByUser(searchVO);

		logger.debug("## second menu size : {} ", result.size());

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", result);
		return map;
	}

	@RequestMapping(value = "/commons/auth/selectThirdMenuList.do")
	public String selectThirdMenuList(@ModelAttribute("searchVO") MenuVO searchVO, ModelMap model) throws Exception {
		String searchUserId = ((SessionVO) UserDetailsHelper.getAuthenticatedUser()).getUserId();
		searchVO.setSearchUserId(searchUserId);
		List<MenuVO> result = menuService.selectTopMenuListByUser(searchVO);

		logger.debug("## third menu size : {} ", result.size());

		model.addAttribute("thirdMenuList", result);
		return "forward:/common/staffMainView.do";
	}
	
	@RequestMapping(value = "/commons/auth/selectFourthMenuList.do")
	@ResponseBody
	public Object selectFourthMenuList(@ModelAttribute("searchVO") MenuVO searchVO) throws Exception {
		String searchUserId = ((SessionVO) UserDetailsHelper.getAuthenticatedUser()).getUserId();
		searchVO.setSearchUserId(searchUserId);
		List<MenuVO> result = menuService.selectTopMenuListByUser(searchVO);

		logger.debug("## forth menu size : {} ", result.size());

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", result);
		return map;
	}

}
