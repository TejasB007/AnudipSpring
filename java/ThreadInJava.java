package com.threaddemo.java;
//1st way to creating thread by extending thread class

//LifeCycle of Thread: newState-runnableState-runningState-blockState-deadState
class ThreadOne extends Thread{
	
	public void run() {
		for(int i=0; i<=5; i++) {
			
			System.out.println("Thread One: " + i);
		}

	}
	
}
class ThreadTwo extends Thread{
	
	public void run() {
		for(int i=0; i<=5; i++) {
			
			System.out.println("Thread Two: " + i);
		}

	}
}

public class ThreadInJava {

	public static void main(String[] args) {
		
		ThreadOne t1=new ThreadOne();  //new state 
		ThreadTwo t2=new ThreadTwo();  //new state 
		t1.start();	//runnable state
		t1.start();	//runnable state
		t2.start();
		
		System.out.println("In the main method");

	}

}

