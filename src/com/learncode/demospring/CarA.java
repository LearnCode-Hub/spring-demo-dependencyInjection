package com.learncode.demospring;

public class CarA implements Car {
private String carName;
private String cost;
private String modelNumber;

	/* Setting carName using Constructor */
	public CarA(String carName){
		this.carName=carName;
	}
	
	/* Setting cost using Setter */
	public void setCost(String cost) {
		this.cost = cost;
	}

	/* Setting modelNumber using Setter */
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	@Override
	public void getPrice() {
		System.out.println("Car "+carName);
		System.out.println("Model Number "+modelNumber);
		System.out.println("Base Model Cost "+cost);
	}

}
