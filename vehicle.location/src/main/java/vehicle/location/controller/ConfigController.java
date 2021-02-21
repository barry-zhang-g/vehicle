package vehicle.location.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import vehicle.location.config.ConfigInfo;

@RestController
@Slf4j
public class ConfigController {
	@Autowired
	private ConfigInfo configInfo;

	@GetMapping(value = "getConfigInfo")
	public void getConfigInfo() {
		String serverPort = configInfo.getServerPort();
		System.out.println("port:" + serverPort);
	}

	@GetMapping(value = "getAddress")
	public String getAddress() {
		String address = configInfo.getAddress();
		System.out.println("address:" + address);
		return address;
	}
}