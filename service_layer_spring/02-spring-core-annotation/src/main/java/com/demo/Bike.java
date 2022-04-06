package com.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "v2")
//@Primary
public class Bike  implements Vehical{
	public void move() {
		System.out.println("moving on a bike...");
	}
}
