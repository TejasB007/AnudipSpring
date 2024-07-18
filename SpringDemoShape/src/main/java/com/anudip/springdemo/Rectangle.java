package com.anudip.springdemo;

public class Rectangle implements Shape {

	private String color;
	
	
	public void setColor(String color) {
		this.color = color;
	}


	public void draw() {
		System.out.println("\"Painter is Drawing " + color + "Rectangle");
		
	}




	
}
