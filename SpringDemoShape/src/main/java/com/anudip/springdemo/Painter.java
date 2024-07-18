package com.anudip.springdemo;

public class Painter implements Performer {

	Shape shape;
	
	public Painter(Shape shape) {
		super();
		this.shape = shape;
	}
	
	
	public void perform() {
		
		
		shape.draw();
	}

}
