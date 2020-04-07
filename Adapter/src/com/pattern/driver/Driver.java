package com.pattern.driver;

import com.pattern.adapter.Duck;
import com.pattern.adapter.RedHeadDuck;
import com.pattern.adapter.Turkey;
import com.pattern.adapter.TurkeyAdapter;
import com.pattern.adapter.WildTurkey;

public class Driver {

	public static void main(String[] args) {

		Duck duck = new RedHeadDuck(" Red Headed Duck");
		Turkey turkey = new WildTurkey(" Wild Turkey");
		duck.quack();
		turkey.gobble();
		
		//
		
		Duck duck2 = new TurkeyAdapter(turkey);
		duck2.quack();
		
	}

}
