package com.project.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		//load spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		//call the method 
		boolean result = (theCoach == alphaCoach);
		//print out the result
		System.out.println("Pointing to the theCoach objects memory location: " + theCoach);
		System.out.println("Pointing to the alphaCoach objects memory location: " + alphaCoach);
		System.out.println("Check if both objects pointing to the same memory locations: " + result);
		//close the context
		context.close();
	}
}
