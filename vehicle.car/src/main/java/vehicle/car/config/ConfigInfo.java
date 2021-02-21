package vehicle.car.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ConfigInfo {
	
	@Value("${service.info}")
	private String serviceInfo;
	
	public String getServiceInfo() {
		return serviceInfo;
	}
}
