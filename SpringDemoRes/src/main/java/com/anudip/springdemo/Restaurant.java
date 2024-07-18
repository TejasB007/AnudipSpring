package com.anudip.springdemo;

public class Restaurant {
	
	HotDrink hotDrink;
	
	String welcomeNote;
	
	public Restaurant(HotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	
	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}


	void prepareDrink() {
		hotDrink.prepareHotDring();
	}

	void greetCustomer() {
		System.out.println(welcomeNote);
	}
}
