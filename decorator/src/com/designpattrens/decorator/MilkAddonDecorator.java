package com.designpattrens.decorator;

public class MilkAddonDecorator extends Beverage {
private Beverage beverage;	
@Override
public float getCost() {
	return 20+beverage.getCost();
}
@Override
	public String getDesc() {
		return "I am Milk addon";
	}
public Beverage getBeverage() {
	return beverage;
}
public void setBeverage(Beverage beverage) {
	this.beverage = beverage;
}
public MilkAddonDecorator(Beverage beverage) {
	this.beverage = beverage;
}
}
