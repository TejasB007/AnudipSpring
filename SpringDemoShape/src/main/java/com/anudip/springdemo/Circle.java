package com.anudip.springdemo;

public class Circle implements Shape {

	private String color;
	
	
	public Circle(String color) {
		super();
		this.color = color;
	}


	public void draw() {
		System.out.println("Painter is Drawing " + color + " Circle");
		
	}


	
	
	

}
