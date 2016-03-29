package name.felix.commons.code.service.impl;

import java.util.List;

import name.felix.commons.code.service.NationCode;
import name.felix.commons.code.service.NationCodeVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("NationCodeManageMapper")
public interface NationCodeManageMapper {

	public List<NationCodeVO> selectNationCodeList(NationCodeVO searchVO);

	public NationCodeVO selectNationCodeDetail(NationCodeVO searchVO);

	public void insertNationCode(NationCode nationCode);

	public void updateNationCode(NationCode nationCode);

	public void deleteNationCode(NationCode nationCode);

}
