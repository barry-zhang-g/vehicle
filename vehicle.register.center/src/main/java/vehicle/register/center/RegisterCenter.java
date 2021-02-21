package vehicle.register.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisterCenter {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(RegisterCenter.class, args);
	}
}
