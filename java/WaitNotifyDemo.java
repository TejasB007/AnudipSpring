package com.threaddemo.java;

class Customer extends Thread{
	int amount=10000;
	
	synchronized void withdraw(int amount) {
		
		System.out.println("Going to withdraw...");
		if(this.amount < amount) {
			System.out.println("Less balance; waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.amount=this.amount-amount;
		System.out.println(Thread.currentThread().getName()+ " " +this.amount);
		System.out.println("Withdraw completed");
	}
	synchronized void deposit(int amount) {
		
		System.out.println("Going to deposit...");
		this.amount=this.amount+amount;
		System.out.println(Thread.currentThread().getName()+ " " +this.amount);
		System.out.println("Deposit completed");
		notifyAll();
	}
}
public class WaitNotifyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer=new Customer();
		
		new Thread() {
			public void run() {
				customer.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run() {
				customer.deposit(10000);
			}
		}.start();
		

	}

}
