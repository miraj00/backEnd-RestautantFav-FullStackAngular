package com.fullstackangular.backEndRestaurantFaves;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://localhost:8080/orders/{id}")
@RestController
public class OrderController {

	// DAO ( Data Access Object )
	@Autowired
	private OrderRepository repo;
	
	
	// method to access DAO ( Data Access Object )
	@GetMapping("/orders")
	public List<Order> getOrders(){
		return repo.findAll();
	}
	
	// (C)RUD -- Create
	@PostMapping("/orders")
	@ResponseStatus(HttpStatus.CREATED)
	public Order create(@RequestBody Order order) {
		repo.save(order);
		return order;
	}
	
	
	@DeleteMapping("/orders/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		repo.deleteById(id);
	}
	
	
}
