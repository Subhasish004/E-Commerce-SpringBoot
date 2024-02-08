package com.entity;

import java.util.List;

public class Order {
 private Customer customer;
 private List<OrderItem> orderItems;
 
public Order() {
	super();
	// TODO Auto-generated constructor stub
}

public Order(Customer customer) {
	super();
	this.customer = customer;
}
public void addItem(OrderItem orderItem) {
	orderItems.add(orderItem);
}

@Override
public String toString() {
	return "Order [customer=" + customer + " , Order Items = " + orderItems+"]";
}


 
}
