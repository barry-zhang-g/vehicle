package vehicle.location.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigInfo {
	@Value("${server.port}")
	private String serverPort;
	
	@Value("${vehicle.location.address}")
	private String address;

	public String getServerPort() {
		return serverPort;
	}
	
	public String getAddress() {
		return address;
	}
}
