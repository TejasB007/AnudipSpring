package com.anudip.springdemo;

public class Triangle implements Shape{
	String color;
	
	public Triangle() {
		super();
		
	}

	public void draw() {
		System.out.println("Painter is drawing"+ color + " color traingle");
		
	}
	
	

}
