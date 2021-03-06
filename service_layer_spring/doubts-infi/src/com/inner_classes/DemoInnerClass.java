package com.inner_classes;
//What is inner class? a class defined inside an another class, it is like mother and child relationship

//class A{
//	
//	//top leve inner class
//	class B{
//		void foo() {
//			System.out.println("foo of B class");
//		}
//	}
//}
//class LinkList{
//	class Node{
//		
//	}
//}

interface Cookable {
	public void cook();
}

public class DemoInnerClass {

	public static void main(String[] args) {

		// java 8 :strams, labmda!

		Cookable cookable = () -> System.out.println("cook method is implemented....");

		Cookable cookable2 = () -> System.out.println("cook method is implemented....");

		// annonymous(No name) inner class

//		Cookable cookable=new Cookable() {
//			@Override
//			public void cook() {
//				System.out.println("cook method is implemented....");
//			}
//		};
//		
//		Cookable cookable2=new Cookable() {
//			@Override
//			public void cook() {
//				System.out.println("cook method is implemented..another..");
//			}
//		};
//		
	}

}
