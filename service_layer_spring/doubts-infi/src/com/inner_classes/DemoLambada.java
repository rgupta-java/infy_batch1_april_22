package com.inner_classes;

public class DemoLambada {
	
	public static void main(String[] args) {
		Runnable runnable=()-> System.out.println("job of the thread....");
		
		Thread thread=new Thread(runnable);
		thread.start();
	}

}
