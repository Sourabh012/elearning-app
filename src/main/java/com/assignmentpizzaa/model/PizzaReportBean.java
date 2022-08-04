package com.assignmentpizzaa.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PizzaReportBean {

		private int orderId;
		private String customerName;
		private String customerNumber;
		private int pizzaId;
		private int quantity;
		private int bill;
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
		public int getBill() {
			return bill;
		}
		public void setBill(int bill) {
			this.bill = bill;
		}
		public PizzaReportBean(int orderId, String customerName, String customerNumber, int pizzaId, int quantity, int bill) {
			super();
			this.orderId = orderId;
			this.customerName = customerName;
			this.customerNumber = customerNumber;
			this.pizzaId = pizzaId;
			this.quantity = quantity;
			this.bill = bill;
		}
		public PizzaReportBean() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		
	}