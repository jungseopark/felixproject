package name.felix.commons.code.service.impl;

import java.util.List;

import javax.annotation.Resource;

import name.felix.commons.code.service.NationCode;
import name.felix.commons.code.service.NationCodeManageService;
import name.felix.commons.code.service.NationCodeVO;
import name.felix.core.service.impl.FelixAbstractServiceImpl;

import org.springframework.stereotype.Service;

@Service("NationCodeManageService")
public class NationCodeManageServiceImpl extends FelixAbstractServiceImpl implements NationCodeManageService {

	@Resource(name = "NationCodeManageMapper")
	NationCodeManageMapper nationCodeManageMapper;

	public List<NationCodeVO> selectNationCodeList(NationCodeVO searchVO) throws Exception {
		return nationCodeManageMapper.selectNationCodeList(searchVO);
	}

	public NationCodeVO selectNationCodeDetail(NationCodeVO searchVO) throws Exception {
		return nationCodeManageMapper.selectNationCodeDetail(searchVO);
	}

	public void insertNationCode(NationCode nationCode) throws Exception {
		nationCodeManageMapper.insertNationCode(nationCode);
	}

	public void updateNationCode(NationCode nationCode) throws Exception {
		nationCodeManageMapper.updateNationCode(nationCode);
	}

	public void deleteNationCode(NationCode nationCode) throws Exception {
		nationCodeManageMapper.deleteNationCode(nationCode);
	}

}
