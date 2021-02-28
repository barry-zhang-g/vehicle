package vehicle.car.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="location",fallback = CarServiceImpl.class)
public interface CarService {
	@GetMapping(value = "/getLocation")
	public String getLocation();
	
	@GetMapping(value = "/getCarInfo")
	public String getCarInfo(@RequestParam String id);


}
