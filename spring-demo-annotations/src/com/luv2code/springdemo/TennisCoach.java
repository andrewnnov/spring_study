package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component                                      //default id it is "tennisCoach"
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">>Tennis coach: inside default constructor");
	}
	
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> Tennis coach: inside default doSomeCrazyStuff() method");
		fortuneService = theFortuneService;
	}	
	*/
	
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
