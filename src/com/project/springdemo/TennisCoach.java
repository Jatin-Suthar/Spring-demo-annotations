package com.project.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component //("thatSillyCoach")
//@Scope("prototype")
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
	
	//define my inti method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println(">> TennisCoach: inside doMyStartUpStuff method <<");
	}
	//define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">> TennisCoach: inside doMyCleanUpStuff method <<");
	}
}
