package com.Spring.Demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringDemo {

	public static void main(String[] arg) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("file:src/main/java/com/Spring/Demo/spring.xml");

		Triangle tr = (Triangle) context.getBean("triangle");
		tr.Draw();

	}
}
