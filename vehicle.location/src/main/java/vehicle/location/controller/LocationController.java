package vehicle.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vehicle.location.config.ConfigInfo;

@RestController
public class LocationController {
	
	@Autowired
	private ConfigInfo configInfo;

	@GetMapping(value = "/getLocation")
	public String getLocation() {
		return configInfo.getServerPort();
	}

}
