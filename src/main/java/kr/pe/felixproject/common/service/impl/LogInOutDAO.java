package kr.pe.felixproject.common.service.impl;

import kr.pe.felixproject.common.service.LogInOutVO;
import kr.pe.felixproject.core.FelixAbstractDAO;

import org.springframework.stereotype.Repository;

@Repository("LogInOutDAO")
public class LogInOutDAO extends FelixAbstractDAO {
	
	public String encryptPassword(String password) throws Exception {
		return (String)selectByPk("LogInOutDAO.encryptPassword", password);
	}
	
	public LogInOutVO actionLogIn(LogInOutVO vo) throws Exception {
		return (LogInOutVO)selectByPk("LogInOutDAO.actionLogIn", vo);
	}

}
