package com.a.basics_oo.h.a;

class A {
	void fooA() {
		System.out.println("fooA of A class");
	}
}

class B extends A {
	void fooB() {
		System.out.println("fooB of B class");
	}
}

class C extends A {
	void fooC() {
		System.out.println("fooC of C class");
	}
}

public class DemoCastingInTermsOfObject {

	public static void main(String[] args) {
//		//casting : upcasting ( :)  vs downlaoding :(

		A a1 = new B();
		A a2 = new C();

//		C c1=(C) a2;
//		c1.fooC();

		if (a1 instanceof C) {
			C c1 = (C) a1;
			c1.fooC();
		} else
			System.out.println("we are doing some stupid operation");

	}

}
