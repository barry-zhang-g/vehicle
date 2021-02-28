package vehicle.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vehicle.location.config.ConfigInfo;

@RestController
public class LocationController {

	@Autowired
	private ConfigInfo configInfo;

	@GetMapping(value = "/location/getLocation")
	public String getLocation() {
		return configInfo.getServerPort();
	}

	@GetMapping(value = "/location/getCarInfo")
	public String getCarInfo(@RequestParam String id) throws Exception {
		if (id.equals("1")) {
			throw new Exception("id=1");
		}
		return id + "bmw";
	}

}
