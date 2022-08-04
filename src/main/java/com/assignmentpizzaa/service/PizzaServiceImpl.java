package com.assignmentpizzaa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignmentpizzaa.dao.PizzaDao;
import com.assignmentpizzaa.entity.Pizza;
import com.assignmentpizzaa.entity.PizzaBill;
import com.assignmentpizzaa.entity.PizzaReport;


@Service
public class PizzaServiceImpl implements PizzaService{

	@Autowired
	PizzaDao dao;
	
	public List<Pizza> getAllPizza() {
		return dao.getAllPizza();
	}
	
	public double fectingPizzaAmount(int pizzaId) {
		return dao.fetchingPizzaAmount(pizzaId);
	}
	
	public void insertingRecordInDatabase(PizzaReport pizzaReport) {
		 dao.insertingRecordInDatabase(pizzaReport);
	}
	
	public List<PizzaReport> fetchingPizzaDetails(PizzaBill pizzaBill){
		return dao.fetchingPizzaDetails(pizzaBill);
	}
	
}

