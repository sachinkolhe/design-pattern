package com.pattern.driver;

import com.pattern.decorator.BasePizza;
import com.pattern.decorator.Cheese;
import com.pattern.decorator.MargheritaPizza;
import com.pattern.decorator.Pizza;
import com.pattern.decorator.Tomato;

public class Driver {

	public static void main(String[] args) {

		Pizza pizza = new MargheritaPizza("Margherita");
		Double cost = new Cheese(new Tomato(pizza)).getCost();
		System.out.println("Total cost :: " + cost);

		Pizza pizza2 = new BasePizza("Base Pizza");
		Double cost2 = new Cheese(new Tomato(pizza2)).getCost();
		System.out.println("Total cost :: " + cost2);
	}

}
