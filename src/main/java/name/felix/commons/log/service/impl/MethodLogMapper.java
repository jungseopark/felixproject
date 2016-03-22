package name.felix.commons.log.service.impl;

import name.felix.commons.log.service.MethodLog;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("MethodLogMapper")
public interface MethodLogMapper {
	
	public void logInsertMethodLog(MethodLog vo);

}
