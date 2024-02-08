package com.entity;

public class Customer {

	private String name;
	private String email;
	private Cart cart;
	public Customer() {
		super();
		
	}
	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.cart = new Cart();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
}
