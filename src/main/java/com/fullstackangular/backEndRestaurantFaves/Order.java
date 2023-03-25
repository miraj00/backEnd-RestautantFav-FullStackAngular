package com.fullstackangular.backEndRestaurantFaves;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private String restaurant;
	private int rating;
	private boolean orderAgain;
	
	// getter setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public boolean isOrderAgain() {
		return orderAgain;
	}

	public void setOrderAgain(boolean orderAgain) {
		this.orderAgain = orderAgain;
	}

	
	// Empty constructor
	public Order() {
		
	}

	// Constructor with fields
	public Order(Long id, String description, String restaurant, int rating, boolean orderAgain) {
		super();
		this.id = id;
		this.description = description;
		this.restaurant = restaurant;
		this.rating = rating;
		this.orderAgain = orderAgain;
	}
	
	public Order(String description, String restaurant, int rating, boolean orderAgain) {
		super();
		this.description = description;
		this.restaurant = restaurant;
		this.rating = rating;
		this.orderAgain = orderAgain;
	}

	
	
}
