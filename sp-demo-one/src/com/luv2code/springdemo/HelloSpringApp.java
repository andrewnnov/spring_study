package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		//step 2 create a spring container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from the spring container
		//step3
		Coach theCoach = context.getBean("myCoach", Coach.class);
	
		
		//call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
