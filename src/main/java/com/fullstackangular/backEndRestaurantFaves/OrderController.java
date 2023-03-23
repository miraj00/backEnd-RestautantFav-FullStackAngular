package com.fullstackangular.backEndRestaurantFaves;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class OrderController {

	// DAO ( Data Access Object )
	@Autowired
	private OrderRepository repo;
	
	
	// method to access DAO ( Data Access Object )
	@GetMapping("/")
	public List<Order> getOrders(){
		return repo.findAll();
	}
	
	
	
	
}
