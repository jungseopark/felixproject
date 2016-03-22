package name.felix.commons.log.service.impl;

import javax.annotation.Resource;

import name.felix.commons.log.service.MethodLog;
import name.felix.commons.log.service.MethodLogService;
import name.felix.core.service.impl.FelixAbstractServiceImpl;

import org.springframework.stereotype.Service;

@Service("MethodLogService")
public class MethodLogServiceImpl extends FelixAbstractServiceImpl implements MethodLogService {

	@Resource(name = "MethodLogMapper")
	MethodLogMapper methodLogMapper;

	public void logInsertMethodLog(MethodLog vo) throws Exception {
		methodLogMapper.logInsertMethodLog(vo);
	}

}
