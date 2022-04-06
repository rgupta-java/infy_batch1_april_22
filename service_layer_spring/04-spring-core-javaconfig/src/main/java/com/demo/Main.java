package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
//		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		
		AnnotationConfigApplicationContext 
		applicationContext=new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		
		
		Passanger passanger=(Passanger) applicationContext.getBean("passanger");
		
		passanger.travel();
	
	}
}

