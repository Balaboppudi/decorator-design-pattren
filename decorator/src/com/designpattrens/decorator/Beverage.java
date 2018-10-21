package com.designpattrens.decorator;

public abstract class Beverage {
private float cost;
private String desc;
public float getCost() {
	return cost;
}
public void setCost(float cost) {
	this.cost = cost;
}
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}

}
