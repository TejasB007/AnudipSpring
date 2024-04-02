package com.threaddemo.java;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac1=new Account();
		ac1.setName("Tejas");
		
		Account ac2=new Account();
		ac2.setName("ABC");
		
		ac1.start();
		ac2.start();

	}

}
