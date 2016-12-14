package com.maven.Demo;

import org.springframework.stereotype.Component;

@Component
public class First {
	private static String value;
	
	public static void display(){
		System.out.println("Spring Annotation....!");
	}

}
