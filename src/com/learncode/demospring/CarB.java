package com.learncode.demospring;

public class CarB implements Car {
private String message = "Price for Car B starts from 6L";
	@Override
	public void getPrice() {
		// TODO Auto-generated method stub
		System.out.println(message);

	}

}
