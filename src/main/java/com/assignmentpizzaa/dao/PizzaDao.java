package com.assignmentpizzaa.dao;

import java.util.List;

import com.assignmentpizzaa.entity.Pizza;
import com.assignmentpizzaa.entity.PizzaBill;
import com.assignmentpizzaa.entity.PizzaReport;



public interface PizzaDao {

	public List<Pizza> getAllPizza();
	
	public double fetchingPizzaAmount(int pizzaId);
	
	public void insertingRecordInDatabase(PizzaReport pizzaReport);
	
	public List<PizzaReport> fetchingPizzaDetails(PizzaBill pizzaBill);
}
