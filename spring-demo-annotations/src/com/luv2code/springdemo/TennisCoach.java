package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component                                      //default id it is "tennisCoach"
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">>Tennis coach: inside default constructor");
	}
	
	//define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> Tennis coach: inside default setFortuneService() method");
		fortuneService = theFortuneService;
	}	
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {		
		return fortuneService.getFortune();
	}

}
