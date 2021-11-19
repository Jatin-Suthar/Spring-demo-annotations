package com.project.springdemo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.project.springdemo")
public class SportConfig {
	//define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	@Bean 
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	//define bean for our swim coach and inject dependency
}
