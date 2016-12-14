package com.SpringCollection.SpringCollection;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Triangle {

	public static void main(String[] arg) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Point p = (Point)context.getBean("point");
		
	
		Edge ed=(Edge)context.getBean("edge");
	//	p.Info("Hello...!");
		

	}
}
