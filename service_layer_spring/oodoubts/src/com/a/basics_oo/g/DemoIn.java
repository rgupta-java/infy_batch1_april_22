package com.a.basics_oo.g;

class A {
	private int i;

	public A(int i) {
		this.i = i;
	}

	public void fooA() {
		System.out.println("fooA method ");
	}

	public void print() {
		System.out.println("value of i: " + i);
	}

}

class B extends A {
	private int j;

	public B(int i, int j) {
		super(i);
		this.j = j;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("value of j: " + j);
	}

	public void fooB() {
		System.out.println("fooB method ");
	}

}

public class DemoIn {

	public static void main(String[] args) {
		A a=new B(2,6);
		((B) a).fooB();
	}

}
