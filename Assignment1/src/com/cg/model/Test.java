package com.cg.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	    Customer customer1= context.getBean("customer1",Customer.class);
	    Customer customer2 = context.getBean("customer2",Customer.class);
	    
	    customer1.displayCustomer();
	    System.out.println("||  ***************************************  ||");
	    customer2.displayCustomer();	 		
	}
}
