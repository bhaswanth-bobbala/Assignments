package ques1.spring.assiggnmnet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		 * ApplicationContext context1 = new
		 * ClassPathXmlApplicationContext("Ques1b.xml"); Customer customer1 = (Customer)
		 * context1.getBean("customer1"); System.out.println(customer1.toString());
		 */
		
		
		  ApplicationContext context = new ClassPathXmlApplicationContext("Ques1.xml");
		  Customer customer = (Customer) context.getBean("customer");
		  System.out.println(customer.toString());
		
		
	}

}
