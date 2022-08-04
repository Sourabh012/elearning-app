package com.assignmentpizzaa.entity;


public class PizzaBill {
	
	private double fromPrice;
	private double toPrice;
	public double getFromPrice() {
		return fromPrice;
	}
	public void setFromPrice(double fromPrice) {
		this.fromPrice = fromPrice;
	}
	public double getToPrice() {
		return toPrice;
	}
	public void setToPrice(double toPrice) {
		this.toPrice = toPrice;
	}
	public PizzaBill(double fromPrice, double toPrice) {
		super();
		this.fromPrice = fromPrice;
		this.toPrice = toPrice;
	}
	public PizzaBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PizzaBill [fromPrice=" + fromPrice + ", toPrice=" + toPrice + "]";
	}
	
	

}
