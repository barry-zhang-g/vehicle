package vehicle.register.center.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigInfo {
	@Value("${server.port}")
	private String serverPort;
	
	
	public String getServerPort() {
		return serverPort;
	}
}
