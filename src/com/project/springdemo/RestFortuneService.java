package com.project.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return ">> Message: Rest Fortune Service <<";
	}
}
