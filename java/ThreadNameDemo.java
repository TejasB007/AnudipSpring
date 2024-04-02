package com.threaddemo.java;

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("This is my task!!!");
	}
	
}

public class ThreadNameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread mt= new MyThread();
		mt.start();
		mt.setName("Tejas");
		mt.setPriority(1);
		String name=mt.getName();
		System.out.println(mt.getId());
		System.out.println(mt.getPriority());
		System.out.println(name);
	}

}
