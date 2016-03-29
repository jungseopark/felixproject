package name.felix.commons.code.service;

import java.util.List;

public interface NationCodeManageService {

	List<NationCodeVO> selectNationCodeList(NationCodeVO searchVO) throws Exception;

	NationCodeVO selectNationCodeDetail(NationCodeVO searchVO)throws Exception;

	void insertNationCode(NationCode nationCode) throws Exception;

	void updateNationCode(NationCode nationCode) throws Exception;

	void deleteNationCode(NationCode nationCode) throws Exception;

}
