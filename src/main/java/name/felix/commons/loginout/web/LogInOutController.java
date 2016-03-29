package name.felix.commons.loginout.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import name.felix.commons.auth.service.MenuService;
import name.felix.commons.auth.service.MenuVO;
import name.felix.commons.loginout.service.LogInOutService;
import name.felix.commons.loginout.service.LogInOutVO;
import name.felix.core.FelixMessageSource;
import name.felix.core.session.SessionVO;
import name.felix.core.util.ClientInformation;
import name.felix.core.web.FelixAbstractController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogInOutController extends FelixAbstractController {

	@Resource(name = "LogInOutService")
	LogInOutService logInOutService;

	@Resource(name = "felixMessageSource")
	FelixMessageSource felixMessageSource;
	
	@Resource(name = "MenuService")
	MenuService menuService;

	@RequestMapping(value = "/common/logInPageView.do")
	public String logInUserView(@ModelAttribute("loginVO") LogInOutVO logInVO) throws Exception {
		return "login";
	}

	@RequestMapping(value = "/common/actionLogIn.do")
	public String actionLogIn(@ModelAttribute("loginVO") LogInOutVO logInVO, HttpServletRequest request, ModelMap model) throws Exception {

		String clientIpAddress = ClientInformation.getClientIp(request);
		LogInOutVO resultVO = logInOutService.actionLogIn(logInVO);
		
		// 로그인 정보가 존재하지 않는 경우
		if (resultVO == null || resultVO.getUserId() == null || ("").equals(resultVO.getUserId())) {
			model.addAttribute("message", felixMessageSource.getMessage("fail.common.login"));
			return "login";
		}
		
		SessionVO sessionVO = new SessionVO();
		
		// 세션에 사용자 정보 입력
		sessionVO.setUserId(resultVO.getUserId());
		sessionVO.setUserName(resultVO.getUserName());
		sessionVO.setIpAddress(clientIpAddress);
		sessionVO.setStaffNo(resultVO.getStaffNo());
		
		// 세션에 탑메뉴 리스트 입력
		MenuVO menuVO = new MenuVO();
		menuVO.setSearchUserId(resultVO.getUserId());
		menuVO.setSearchUpperMenuId("0");
		sessionVO.setTopMenuList(menuService.selectTopMenuListByUser(menuVO));
		
		logger.debug("## menuVO size : {}", sessionVO.getTopMenuList().size());
		
		request.getSession().setAttribute("sessionVO", sessionVO);

		return "forward:/common/staffMainView.do";
	}

	@RequestMapping(value = "/common/staffMainView.do")
	public String staffMainView(ModelMap model) throws Exception {
		return "staff_main";
	}
}
