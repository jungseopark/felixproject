package name.felix.commons.log.service.impl;

import name.felix.commons.log.service.WebLog;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("WebLogMapper")
public interface WebLogMapper {

	public void insertWebLog(WebLog vo);

}
