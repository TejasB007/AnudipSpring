package com.threaddemo.java;

class SleepDemo extends Thread{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			sleep(100, 1);
		}
	}
	
}

public class ThreadSleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SleepDemo s1= new SleepDemo();
		s1.start();
		

	}

}
