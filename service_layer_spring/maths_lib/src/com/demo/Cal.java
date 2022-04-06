package com.demo;

import com.internal.CalLogic;
//you want to expose this lib to the world, cal is dep on CalLogic
//and i want that nobody should able to access it outside the project
public class Cal {
	
	public int add(int a, int b) {
		CalLogic calLogic=new CalLogic();
		return calLogic.addLogic(a, b);
	}
}
