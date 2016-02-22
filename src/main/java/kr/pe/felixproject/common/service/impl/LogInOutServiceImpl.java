package kr.pe.felixproject.common.service.impl;

import javax.annotation.Resource;

import kr.pe.felixproject.common.service.LogInOutService;
import kr.pe.felixproject.common.service.LogInOutVO;
import kr.pe.felixproject.core.FelixAbstractServiceImpl;

import org.springframework.stereotype.Service;

@Service("LogInOutService")
public class LogInOutServiceImpl extends FelixAbstractServiceImpl implements LogInOutService {

	@Resource(name = "LogInOutDAO")
	LogInOutMapper logInOutDAO;

	public LogInOutVO actionLogIn(LogInOutVO vo) throws Exception {
		String encryptPassword = logInOutDAO.encryptPassword(vo.getSearchUserPassword());
		vo.setSearchUserPassword(encryptPassword);

		LogInOutVO resultVO = logInOutDAO.actionLogIn(vo);

		if (resultVO != null && resultVO.getUserId() != null && !("").equals(resultVO.getUserId())) {
			return resultVO;
		} else {
			resultVO = new LogInOutVO();
		}
		return resultVO;
	}

}
