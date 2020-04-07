package com.pattern.driver;

import com.pattern.template.HouseBuildingBasicStep;
import com.pattern.template2.NewStep;

public class Driver {

	public static void main(String[] args) {

		HouseBuildingBasicStep step = new NewStep();
		step.follwSteps();
	}

}
