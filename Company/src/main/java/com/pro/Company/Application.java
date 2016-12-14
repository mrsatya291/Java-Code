package com.pro.Company;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String... arg) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HelloService service = (HelloService) context.getBean("helloService");
		service.sayHello();

	}
}
