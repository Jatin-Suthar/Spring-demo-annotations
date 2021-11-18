package com.project.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return ">> Message: Database Fortune Service <<";
	}
}
