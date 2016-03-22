package name.felix.commons.auth.service.impl;

import java.util.List;

import name.felix.commons.auth.service.MenuVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("MenuMapper")
public interface MenuMapper {
	
	public List<MenuVO> selectTopMenuListByUser(MenuVO vo);

}
