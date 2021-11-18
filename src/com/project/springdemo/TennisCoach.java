package com.project.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //("thatSillyCoach")
public class TennisCoach implements Coach {

	@Autowired
//	@Qualifier("happyFortuneService")
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor <<");
	}
	
//  @Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your trickshot!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	 
	//define the setter method and autowired it.
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneservice) {
//		System.out.println(">> TennisCoach: inside setFortuneService setter method <<");
//		fortuneService = theFortuneservice;
//	}
//	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService theFortuneService) {
//		System.out.println(">> TennisCoach: inside doSomeCrazyStuff method <<");
//		fortuneService = theFortuneService;
//	}
}
