package com.learncode.demospring;

public class CarA implements Car {
String carName;
String cost;
int modelNumber;

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
		System.out.println("Cost for car "+carName+" Model Number "+modelNumber+" is "+cost);

	}

}
