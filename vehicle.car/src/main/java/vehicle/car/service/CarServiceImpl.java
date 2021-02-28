package vehicle.car.service;

import org.springframework.stereotype.Component;

@Component
public class CarServiceImpl implements CarService {

	@Override
	public String getLocation() {
		System.out.println("error.");
		return "getLocation";
	}

	@Override
	public String getCarInfo(String id) {
		System.out.println("error.");
		return "bmw";
	}

}
