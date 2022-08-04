package com.assignmentpizzaa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
public class PizzaReport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int orderId;
	@Length(min=3,max=30,message="Customer Name should have length between 3 to 30")
	private String customerName;
	@Length(min=10,max=10,message="Contact Number should have length 10")
	private String customerNumber;
	private int pizzaId;
	@Min(1)
	private int quantity;
	private double bill;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public int getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(int pizzaId) {
		this.pizzaId = pizzaId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getBill() {
		return bill;
	}
	public void setBill(double bill) {
		this.bill = bill;
	}
	public PizzaReport(int orderId, String customerName, String customerNumber, int pizzaId, int quantity, double bill) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.customerNumber = customerNumber;
		this.pizzaId = pizzaId;
		this.quantity = quantity;
		this.bill = bill;
	}
	public PizzaReport() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PizzaReport [orderId=" + orderId + ", customerName=" + customerName + ", customerNumber="
				+ customerNumber + ", pizzaId=" + pizzaId + ", quantity=" + quantity + ", bill=" + bill + "]";
	}

	
	
}

