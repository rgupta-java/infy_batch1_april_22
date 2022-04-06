package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext applicationContext
		=new AnnotationConfigApplicationContext(AppConfig.class);
		
//		ApplicationContext applicationContext=
//				new ClassPathXmlApplicationContext("beans.xml");
		
		Passanger passanger=(Passanger) applicationContext.getBean("passanger");
		
		passanger.travel();
		/*
		 * Vehical vehical=new Car();
		 * 
		 * Passanger passanger=new Passanger("raj", vehical); passanger.travel();
		 */
	}
}

