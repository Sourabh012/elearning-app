package com.assignmentpizzaa.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assignmentpizzaa.entity.Pizza;
import com.assignmentpizzaa.entity.PizzaBill;
import com.assignmentpizzaa.entity.PizzaReport;
import com.assignmentpizzaa.service.PizzaService;

@Controller
public class MainController {
	
	@Autowired
	PizzaService pizzaService;
	
	@RequestMapping(value="/home",method = RequestMethod.GET)
	public String home()
	{
		//System.out.println("home is running");
		return "home";
	}
	
	@RequestMapping("/SaveOrder")
	public ModelAndView saveorder()
	{
		PizzaReport pizzaReport = new PizzaReport();
		//System.out.println("saveorder page will show");
		return new ModelAndView("saveOrder","pizzaReport", pizzaReport);
	}
	
	@RequestMapping(value = "/processform", method = RequestMethod.POST)
	public ModelAndView login(@Valid @ModelAttribute("pizzaReport") PizzaReport pizzaReport,Errors errors) {

		if(errors.hasErrors()) {
			return new ModelAndView("saveOrder");
		}
	   // System.out.println(pizzaReport);
	    double tempBill = this.pizzaService.fectingPizzaAmount(pizzaReport.getPizzaId());
	    //System.out.println(tempBill);
	    double finalBill = (pizzaReport.getQuantity()*tempBill);
	    pizzaReport.setBill(finalBill);
	    //System.out.println(pizzaReport.getBill());
	    this.pizzaService.insertingRecordInDatabase(pizzaReport);
	    //System.out.println("record saved successfully");
	    ModelAndView modelAndView = new ModelAndView("SuccessfullyOrderd");
	    modelAndView.addObject("message","Hi:' "+pizzaReport.getCustomerName()+ " your order is placed with OrderId:'" +pizzaReport.getOrderId()+ "',Bill to be Paid is: '" +pizzaReport.getBill()) ;
	    return modelAndView;
	}
	
	@RequestMapping("/OrderReport")
	public ModelAndView orderreport()
	{
		PizzaBill pizzaBill = new PizzaBill();
		//System.out.println("order report page will show");
		return new ModelAndView("orderReport","pizzaBill", pizzaBill);
	}
	
	@RequestMapping(value = "/orderreport", method = RequestMethod.POST)
	public ModelAndView login(    @ModelAttribute("pizzaBill") PizzaBill pizzaBill,
	                        BindingResult result) {

	   List<PizzaReport> pizzaReportList = this.pizzaService.fetchingPizzaDetails(pizzaBill);
	   
	   ModelAndView modelAndView = new ModelAndView();
	   if(pizzaReportList.isEmpty())
	   {
		   modelAndView.addObject("message","No records were found for the entered Bill Range");
		   modelAndView.setViewName("GeneralizedExceptionHandlerPage");
		   return modelAndView;
	   }
	   
//	   List<PizzaReport> n = new ArrayList<PizzaReport>(); 
//	   
//	   for(PizzaReport l:list)
//	   {
//		   if(l.getBill() >= pizzaBill.getFromPrice() && l.getBill() <= pizzaBill.getToPrice())
//		   {
//			   n.add(l);
//		   }
//	   }
	    modelAndView.setViewName("orderReport");
	    modelAndView.addObject("pizzaReportList",pizzaReportList) ;
	    return modelAndView;
	}
	
	
	
	
/*Dynamic drop-down list of pizza's*/
	@ModelAttribute("pizzaListDone")
	public Map<Integer,String> populatePizza() {
		//System.out.println("**pizza List Initialized***");
		
		
		List<Pizza> pizza = pizzaService.getAllPizza();
		//System.out.println(pizza);
		
		Map<Integer,String> m= new HashMap<Integer, String>();
		
		for(Pizza p:pizza)
		{
			m.put(p.getPizzaId(),p.getPizzaName());
		}
		//System.out.println(m);
		return m;
	}

}
