package vehicle.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Location {
	public static void main(String[] args) throws Exception {
		//first eureka server
		SpringApplication.run(Location.class, args);
	}
}
