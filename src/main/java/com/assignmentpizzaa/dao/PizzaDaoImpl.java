package com.assignmentpizzaa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.assignmentpizzaa.entity.Pizza;
import com.assignmentpizzaa.entity.PizzaBill;
import com.assignmentpizzaa.entity.PizzaReport;



@Repository
@Transactional
public class PizzaDaoImpl implements PizzaDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public List<Pizza> getAllPizza() {
		List<Pizza> list = this.hibernateTemplate.loadAll(Pizza.class);
		
		return list;
	}

	public double fetchingPizzaAmount(int pizzaId) {
	Pizza pizzaAmount = this.hibernateTemplate.get(Pizza.class, pizzaId);
	//System.out.println(pizzaAmount);
	return pizzaAmount.getPrice();
	}
	
	
	public void insertingRecordInDatabase(PizzaReport pizzaReport) {
		this.hibernateTemplate.save(pizzaReport);
	}
	
	public List<PizzaReport> fetchingPizzaDetails(PizzaBill pizzaBill){
		
		 double price1 = pizzaBill.getFromPrice();
		 double price2 = pizzaBill.getToPrice();
		 String query="from PizzaReport p where p.bill >= "+price1+" and p.bill <="+price2;
		 List<PizzaReport> list = (List<PizzaReport>)this.hibernateTemplate.find(query);
		// System.out.println(list);
		 return list;
	}
	
}
