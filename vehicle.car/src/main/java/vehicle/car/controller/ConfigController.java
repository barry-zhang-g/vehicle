package vehicle.car.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vehicle.car.config.ConfigInfo;
import vehicle.car.service.CarService;

@RestController
public class ConfigController {
	@Autowired
	private ConfigInfo configInfo;
	
	@GetMapping(value = "/getConfigInfo")
	public ConfigInfo getConfigInfo() {
		return configInfo;
	}
	


}
