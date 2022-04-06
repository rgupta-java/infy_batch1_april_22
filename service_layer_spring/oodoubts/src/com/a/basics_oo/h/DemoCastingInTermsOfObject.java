package com.a.basics_oo.h;
class A{
	int i=90;
	void foo() {
		System.out.println("foo "+ i);
	}
}

class B extends A{
	int j=900;
	void foo2() {
		System.out.println("foo "+ j);
	}
	
}
class C extends A{
	
}
public class DemoCastingInTermsOfObject {
	
	public static void main(String[] args) {
//		//casting : upcasting ( :)  vs downlaoding :(
//		B b=new A();
//		
//		b.foo();
//		b.foo2();
	}

}
