package vehicle.car.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("location")
public interface CarService {
	@GetMapping(value = "/getLocation")
	public String getLocation();

}
