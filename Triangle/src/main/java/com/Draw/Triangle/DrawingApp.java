package com.Draw.Triangle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] arg) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle tr = (Triangle) context.getBean("triangle");
		tr.Draw();

	}

}
