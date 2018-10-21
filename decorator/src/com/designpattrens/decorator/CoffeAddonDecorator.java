package com.designpattrens.decorator;

public class CoffeAddonDecorator extends Beverage {
private Beverage beverage;	
@Override
public float getCost() {
	return 15+beverage.getCost();
}
@Override
	public String getDesc() {
		return "I am Coffe addon";
	}
public Beverage getBeverage() {
	return beverage;
}
public void setBeverage(Beverage beverage) {
	this.beverage = beverage;
}
public CoffeAddonDecorator(Beverage beverage) {
	this.beverage= beverage;
} 
}
