package com.learncode.demospring;

public class CarA implements Car {
private String carName;
private String cost;
private String modelNumber;

	//setting carName using Constructor
	public CarA(String carName){
		this.carName=carName;
	}
	
	//setting cost and modelNumber using Setter method
	public void setCost(String cost) {
		this.cost = cost;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	@Override
	public void getPrice() {
		System.out.println("Cost for car "+carName+" Model Number "+modelNumber+" is "+cost);

	}

}
