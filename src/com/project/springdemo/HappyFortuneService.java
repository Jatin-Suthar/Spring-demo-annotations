package com.project.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	@Override 
	public String getFortune() {
		return "Today is a lucky day!";
	}
}
