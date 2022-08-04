package com.assignmentpizzaa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assignmentpizzaa.entity.Pizza;
import com.assignmentpizzaa.entity.PizzaBill;
import com.assignmentpizzaa.entity.PizzaReport;



public interface PizzaService {

	public List<Pizza> getAllPizza();
	
	public double fectingPizzaAmount(int pizzaId);
	
	public void insertingRecordInDatabase(PizzaReport pizzaReport);
	
	public List<PizzaReport> fetchingPizzaDetails(PizzaBill pizzaBill);
}
