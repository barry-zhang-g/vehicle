package vehicle.car.controller;

import java.net.URI;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CarController {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private RestTemplate restTemplate ;
	
	@GetMapping(value = "/getInstanceInfos")
	public List<ServiceInstance> getInstanceInfos() {
		List<ServiceInstance> instances = discoveryClient.getInstances("location");
		for (Iterator i = instances.iterator(); i.hasNext();) {
			ServiceInstance instanceInfo = (ServiceInstance) i.next();
			URI uri = instanceInfo.getUri();
			
			System.out.println("uri:"+uri.toString());
			
		}
		return instances;
	}
	
	@GetMapping(value = "/getLocation")
	public String getLocation() {
		ResponseEntity<String> entity = restTemplate.exchange("http://location/getLocation", HttpMethod.GET,null,String.class);
		System.out.println("location:"+entity.getBody());
		return entity.getBody();
	}


}
