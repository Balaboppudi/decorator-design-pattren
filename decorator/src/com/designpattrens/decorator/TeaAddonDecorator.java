package com.designpattrens.decorator;

public class TeaAddonDecorator extends Beverage {
private Beverage beverage;	
@Override
public float getCost() {
	return 10+beverage.getCost();
}
@Override
	public String getDesc() {
		return "I am Tea addon";
	}
public Beverage getBeverage() {
	return beverage;
}
public void setBeverage(Beverage beverage) {
	this.beverage = beverage;
}
public TeaAddonDecorator(Beverage beverage) {
	this.beverage = beverage;
}
}
