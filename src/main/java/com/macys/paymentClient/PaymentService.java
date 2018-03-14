package com.macys.paymentClient;

public class PaymentService {

	 public String processPayment(String message) {
		 
		 System.out.println("Message to Send -:"+message);
		 
	        return "Echo Message - " + message;
	    }
	
}
