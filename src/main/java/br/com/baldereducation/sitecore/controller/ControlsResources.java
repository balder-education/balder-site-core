package br.com.baldereducation.sitecore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.baldereducation.sitecore.model.domain.to.MenuTO;
import br.com.baldereducation.sitecore.service.ControlsService;

@RestController
@RequestMapping("/app/controls")
public class ControlsResources {
	
	@Autowired
	private ControlsService controlsService;
	
	@RequestMapping(value="/menus", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<MenuTO> getMenus() {
		return controlsService.menus();
	}
	
	@RequestMapping(value="/admin-menus", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<MenuTO> getAdminMenus() {
		return controlsService.adminMenus();
	}

}
