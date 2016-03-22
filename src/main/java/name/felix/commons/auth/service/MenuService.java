package name.felix.commons.auth.service;

import java.util.List;

public interface MenuService {
	
	List<MenuVO> selectTopMenuListByUser(MenuVO vo) throws Exception;

}
