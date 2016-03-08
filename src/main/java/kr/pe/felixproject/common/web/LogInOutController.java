package kr.pe.felixproject.common.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import kr.pe.felixproject.common.service.LogInOutService;
import kr.pe.felixproject.common.service.LogInOutVO;
import kr.pe.felixproject.core.FelixAbstractController;
import kr.pe.felixproject.core.FelixMessageSource;
import kr.pe.felixproject.core.service.ClientInformation;
import kr.pe.felixproject.core.service.SessionVO;

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

	@RequestMapping(value = "/common/logInPageView.do")
	public String logInUserView(@ModelAttribute("loginVO") LogInOutVO logInVO) throws Exception {
		return "login";
	}
	
	@RequestMapping(value = "/common/actionLogIn.do")
	public String actionLogIn(@ModelAttribute("loginVO") LogInOutVO logInVO, HttpServletRequest request, ModelMap model) throws Exception {
		String clientIpAddress = ClientInformation.getClientIp(request);
		LogInOutVO resultVO = logInOutService.actionLogIn(logInVO);

		logger.debug("### Client IP Address : {}", clientIpAddress);

		if (resultVO != null && resultVO.getUserId() != null && !("").equals(resultVO.getUserId())) {
			SessionVO sessionVO = new SessionVO();
			sessionVO.setUserId(resultVO.getUserId());
			sessionVO.setUserName(resultVO.getUserName());
			sessionVO.setIpAddress(clientIpAddress);
			sessionVO.setStaffNo(resultVO.getStaffNo());
			request.getSession().setAttribute("SessionVO", sessionVO);
			return "forward:/common/staffMainView.do";
		} else {
			model.addAttribute("message", felixMessageSource.getMessage("fail.common.login"));
			return "login";
		}
	}

	@RequestMapping(value = "/common/staffMainView.do")
	public String staffMainView(ModelMap model) throws Exception {
		return "staff_main";
	}
}
