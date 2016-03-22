package name.felix.commons.log.service.impl;

import javax.annotation.Resource;

import name.felix.commons.log.service.WebLog;
import name.felix.commons.log.service.WebLogService;
import name.felix.core.service.impl.FelixAbstractServiceImpl;

import org.springframework.stereotype.Service;

@Service("WebLogService")
public class WebLogServiceImpl extends FelixAbstractServiceImpl implements WebLogService {

	@Resource(name = "WebLogMapper")
	WebLogMapper webLogMapper;

	public void insertWebLog(WebLog vo) throws Exception {
		webLogMapper.insertWebLog(vo);
	}

}
