package com.learncode.demospring;

public class CarA implements Car {
private String carName;
private String cost;
private int modelNumber;
    
	//Setting carName and modelNumber using Constructor
	public CarA(String carName,int modelNumber){
		this.carName=carName;
		this.modelNumber=modelNumber;
	}
	
	public void setCost(String cost) {
		this.cost = cost;
	}

/*	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	} */

	@Override
	public void getPrice() {
		System.out.println("Car "+carName);
		System.out.println("Model Number "+modelNumber);
		System.out.println("Base Model Cost "+cost);

	}

}
