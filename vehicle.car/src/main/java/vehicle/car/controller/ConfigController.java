package vehicle.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vehicle.car.config.ConfigInfo;

@RestController
public class ConfigController {
	@Autowired
	private ConfigInfo configInfo;
	
	@GetMapping(value = "/getConfigInfo")
	public ConfigInfo getConfigInfo() {
		return configInfo;
	}
	


}
