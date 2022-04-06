package com.oops;
//A passanger is moving from LN to Noida "using" metro
interface Vehical{
	public void move(String s, String d);
}
class Car implements Vehical{
	public void move(String s, String d) {
		System.out.println(" passanger is moving from "+ s + " to "+ d+ "using car");
	}
}

class Bike implements Vehical{
	public void move(String s, String d) {
		System.out.println(" passanger is moving from "+ s + " to "+ d+ "using bike");
	}
}

class Metro implements Vehical{
	public void move(String s, String d) {
		System.out.println(" passanger is moving from "+ s + " to "+ d+ "using metro");
	}
}

class Passanger{
	private String name;
	public Passanger(String name) {
		this.name = name;
	}

	public void travel(String s, String d,Vehical vehical) {
		System.out.println("name: "+ name);
		vehical.move(s, d);
	}
}
public class RelationShipBwTheObjects {
	
	public static void main(String[] args) {
		//foolish code: if u have one change in the req... ur code have to change at many places :(
		//Metro metro =new Metro();
		Vehical vehical=new Bike();
		Passanger passanger=new Passanger("raj");
		passanger.travel("Preet Vihar", "CP", vehical);
	}

}



