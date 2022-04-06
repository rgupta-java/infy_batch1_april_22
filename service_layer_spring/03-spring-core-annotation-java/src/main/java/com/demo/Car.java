package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component(value = "v1")
public class Car implements Vehical{
	public void move() {
		System.out.println("moving in a car...");
	}
}
