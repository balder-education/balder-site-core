package br.com.baldereducation.sitecore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.baldereducation.sitecore.model.controls.Menu;
import br.com.baldereducation.sitecore.model.controls.MenuAdmin;
import br.com.baldereducation.sitecore.model.domain.to.MenuTO;
import br.com.baldereducation.sitecore.service.ControlsService;

@Service
public class ControlsServiceImpl implements ControlsService {

	@Override
	public List<MenuTO> menus() {
		List<MenuTO> menus = new ArrayList<>();
		
		MenuTO menuTO = null;
		for (Menu menu : Menu.values()) {
			if (menu.isActive()) {
				menuTO = new MenuTO(menu.getLink(), menu.getTitle(), menu.getIcon());
				menus.add(menuTO);
			}
		}
		return menus;
	}

	@Override
	public List<MenuTO> adminMenus() {
		List<MenuTO> menus = new ArrayList<>();
		
		MenuTO menuTO = null;
		for (MenuAdmin menu : MenuAdmin.values()){
			if (menu.isActive()) {
				menuTO = new MenuTO(menu.getLink(), menu.getTitle(), menu.getIcon());
				menus.add(menuTO);
			}
		}
		return menus;
	}

}
