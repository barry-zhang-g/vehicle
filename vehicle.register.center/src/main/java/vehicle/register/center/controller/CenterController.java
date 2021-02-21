package vehicle.register.center.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vehicle.register.center.config.ConfigInfo;

@RestController
public class CenterController {
	@Autowired
	private ConfigInfo configInfo;
	
	@GetMapping(value="getConfigInfo")
	public void getConfigInfo() {
		String serverPort = configInfo.getServerPort();
		System.out.println("port:"+serverPort);
	}
}
