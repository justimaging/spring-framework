package com.test.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfiguration {
	@Bean
	public Car getCar(){
		Car car = new Car();
		car.setName("测试");
		car.setTest(111);
		return car;
	}
}
