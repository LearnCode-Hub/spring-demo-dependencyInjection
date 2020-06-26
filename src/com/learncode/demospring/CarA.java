package com.learncode.demospring;

public class CarA implements Car {
String carName;
String cost;
String modelNumber;

	public CarA(String carName){
		this.carName=carName;
	}
	
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
