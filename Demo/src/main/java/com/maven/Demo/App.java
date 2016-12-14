package com.maven.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		
    		ApplicationContext context = 
            new AnnotationConfigApplicationContext(First.class);
    	First fr=(First)context.getBean("first");
    	fr.display();
        System.out.println( "Hello World!" );
    }
}
