package com.assignmentpizzaa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pizza {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pizzaId;
	private String pizzaName;
	private int price;
	public int getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Pizza(int pizzaId, String pizzaName, int price) {
		super();
		this.pizzaId = pizzaId;
		this.pizzaName = pizzaName;
		this.price = price;
	}
	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pizza [pizzaId=" + pizzaId + ", pizzaName=" + pizzaName + ", price=" + price + "]";
	}

	
	
}
