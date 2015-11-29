package br.com.baldereducation.sitecore.service;

import java.util.List;

import br.com.baldereducation.sitecore.model.domain.to.MenuTO;

public interface ControlsService {
	public List<MenuTO> menus();
	public List<MenuTO> adminMenus();
}
