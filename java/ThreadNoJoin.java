package com.threaddemo.java;

public class ThreadNoJoin extends Thread{
	
	

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+ " " + "1");
		
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " " + "2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadNoJoin tj1=new ThreadNoJoin();
		ThreadNoJoin tj2=new ThreadNoJoin();
		tj1.setName("Tejas");
		tj2.setName("Sukesh");
		tj1.start();
		try {
			tj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tj2.start();

	}

}
