package com.threaddemo.java;

public class MainThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		t.setName("Main thread");
		System.out.println(t.getName());
		
		Thread.currentThread().setName("Mai main hu");
		System.out.println(Thread.currentThread().getName());

		System.out.println(Thread.MIN_PRIORITY);
	}

}
