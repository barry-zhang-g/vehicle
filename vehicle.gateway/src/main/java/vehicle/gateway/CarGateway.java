package vehicle.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CarGateway {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(CarGateway.class, args);
	}

}
