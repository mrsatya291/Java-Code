package com.automobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] arg){
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		Bike honda=(Bike)context.getBean("Bike");
		honda.Info("Apache");
		System.out.println(honda.toString());
		
		
		
		
	}

}
