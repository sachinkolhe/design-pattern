package com.pattern.adapter;

public class WildTurkey extends Turkey {

	public WildTurkey(String name) {
		this.name = name;
	}

	@Override
	public void gobble() {
		System.out.println(this.name + " is gobbling ");
	}
}
