package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// create the object
		//this is still hardcoded!!!
		Coach theCoach = new TrackCoach();
		
		//use the object
		
		System.out.println(theCoach.getDailyWorkout());

	}

}
