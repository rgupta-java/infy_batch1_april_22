package com.a.basics_oo.b;

import java.util.Scanner;

//A passanger is moving from LN to Noida "using" metro

// when to go for interface vs abstract class

abstract interface Vehical {
	public abstract void move(String s, String d);
}

class Car implements Vehical {
	public void move(String s, String d) {
		System.out.println(" passanger is moving from " + s + " to " + d + " using car");
	}
}

class Bike implements Vehical {
	public void move(String s, String d) {
		System.out.println(" passanger is moving from " + s + " to " + d + " using bike");
	}
}

class Metro implements Vehical {
	public void move(String s, String d) {
		System.out.println(" passanger is moving from " + s + " to " + d + " using metro");
	}
}

class Passanger {
	private String name;

	public Passanger(String name) {
		this.name = name;
	}

	public void travel(String s, String d, Vehical vehical) {
		System.out.println("name: " + name);
		vehical.move(s, d);
	}
}

public class RelationShipBwTheObjects {

	public static void main(String[] args) {
		
		//WHAT IS RUN TIME POLYMORPHISM ? 	choosing at run time ==> code flexibility==> loose coupling
		System.out.println("PE choice of vehical 1. Metro 2. Bike 3. Car...");
		Scanner scanner = new Scanner(System.in);// Decorator dp

		int choice = scanner.nextInt();

		Vehical vehical = null;
		if (choice == 1) {
			vehical = new Metro();
		} else if (choice == 2) {
			vehical = new Bike();
		} else if (choice == 3) {
			vehical = new Car();
		}
		Passanger passanger = new Passanger("raj");
		if (vehical != null)
			passanger.travel("Preet Vihar", "CP", vehical);
		else
			System.out.println("i told u to choose correct values :(");
		
		scanner.close();
	}

}
