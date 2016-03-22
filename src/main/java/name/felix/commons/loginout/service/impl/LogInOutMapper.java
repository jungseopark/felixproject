package name.felix.commons.loginout.service.impl;

import name.felix.commons.loginout.service.LogInOutVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("LogInOutDAO")
public interface LogInOutMapper {

	public String encryptPassword(String password);

	public LogInOutVO actionLogIn(LogInOutVO vo);

}
