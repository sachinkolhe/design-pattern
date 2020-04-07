package com.pattern.template;

public abstract class HouseBuildingBasicStep {

	private void step1() {
		System.out.println(" default step 1");
	}

	protected void step2() {
		System.out.println(" default step 2");
	}

	private void step3() {
		System.out.println(" default step 3 ");
	}

	public void follwSteps() {
		step1();
		step2();
		step3();
	}

}
