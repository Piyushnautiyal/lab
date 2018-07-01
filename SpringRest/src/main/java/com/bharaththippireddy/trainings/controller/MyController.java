package com.bharaththippireddy.trainings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// use when spring version is 4 as using this no need to use @ResponseBody annotatons (@RestController)
@Controller
@RequestMapping("/greeting")
public class MyController {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public  @ResponseBody String sayHello(@PathVariable String name) {
		return "Hello " + name;
	}

	
	/*
	 * Here we returning json as we used spring 4 so its dependency automatically getting mapped from classpath otherwise
	 * in previous version need to do in rest-servlet.xml
	 */
	@RequestMapping(value = "/stockQuote/{firmName}", method = RequestMethod.GET)
	public @ResponseBody StockQuoteResponse getStockQuote(@PathVariable String firmName) {
		StockQuoteResponse response = new StockQuoteResponse();
		response.setFirmName(firmName);
		response.setStockValue(1000);
		return response;

	}

}
