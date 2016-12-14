package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import datamodel.Student;

public class TestSpring {

	public static void main(String[] arg) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
		Student st = (Student) context.getBean("Student-Info");
		st.displayInfo();

		Student st1 = (Student) context.getBean("Student-Cons");
		st1.displayInfo();

	}

}
