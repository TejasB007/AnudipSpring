package com.threaddemo.java;

//2nd way to create the thread by implementing runnable interface

class Thread1 implements Runnable{
	
	public void run() {
		for(int i=0; i<=5; i++) {
			
			System.out.println("Thread One: " + i);
		}
	}
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			
			System.out.println("Thread Two: " + i);
		}
	}
	
	
}

public class ThreadInJavaRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread1 t1=new Thread1();
		Thread t=new Thread(t1);
		t.start();
		
		Thread2 t2=new Thread2();
		Thread tt1=new Thread(t2);
		tt1.start();
		
		System.out.println("My name is main thread");
		
		
		
		
	}

}
