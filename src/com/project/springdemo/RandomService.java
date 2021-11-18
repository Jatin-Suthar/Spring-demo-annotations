package com.project.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public String getFortune() {
		return ">> Message: Random Service <<";
	}
}
