package com.entity;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cart {

	private Map<Product , Integer> items;
	
	public Cart(){
		this.items = new HashMap<>();
	}
	public void addToCart(Product product , int quantity) {
		items.put(product, items.getOrDefault(product, 0)+quantity);
	}
	public void displayCart() {
		System.out.println("Shopping Cart: ");
		items.forEach((product , quantity) ->
		System.out.println(product.getName() + " - Quantity:" + quantity));
	}
	public boolean isEmplty(){
		return items.isEmpty();
		}
	public Map<Product ,Integer> getItems(){
		return Collections.unmodifiableMap(items);
	}
		public void clearCart() {
		items.clear();
	}
		@Override
		public String toString() {
			return "Cart [items=" + items + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(items);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cart other = (Cart) obj;
			return Objects.equals(items, other.items);
		}
		
		
}
