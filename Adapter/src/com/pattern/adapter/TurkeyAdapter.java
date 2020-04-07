package com.pattern.adapter;

public class TurkeyAdapter extends Duck {

	private Turkey turkey;
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	@Override
	public void quack() {
		turkey.gobble();
	}

}
