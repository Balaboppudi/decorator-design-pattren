package com.designpattrens.decorator;

public class DecoratoeDemo {

	public static void main(String[] args) {

		Beverage beverage = new Dosa();
		beverage = new TeaAddonDecorator(beverage);
		beverage = new TeaAddonDecorator(beverage);
		beverage = new CoffeAddonDecorator(beverage);
		beverage = new CoffeAddonDecorator(beverage);
		beverage = new MilkAddonDecorator(beverage);
			
		System.out.println(beverage.getCost());
	}

}
