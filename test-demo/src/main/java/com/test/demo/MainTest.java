package com.test.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(CarConfiguration.class);
		String names[] = annotationConfigApplicationContext.getBeanDefinitionNames();
		for (String name :names){
			System.out.println(name);

		}
	}
}
