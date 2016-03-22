package name.felix.commons.auth.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import name.felix.commons.auth.service.MenuService;
import name.felix.commons.auth.service.MenuVO;
import name.felix.core.service.impl.FelixAbstractServiceImpl;

@Service("MenuService")
public class MenuServiceImpl extends FelixAbstractServiceImpl implements MenuService {

	@Resource(name = "MenuMapper")
	MenuMapper menuMapper;

	public List<MenuVO> selectTopMenuListByUser(MenuVO vo) throws Exception {
		return menuMapper.selectTopMenuListByUser(vo);
	}

}
