package com.pattern.driver;

import com.pattern.builder.User;
import com.pattern.builder.UserBuilder;

public class Driver {

	public static void main(String[] args) {

		
//		UserBuilder userB = new UserBuilder().asId(1).name("Sachin").addr("SN69");
//		User user = userB.mobile("9028232359").build();
//		System.out.println(user);
		
		
		UserBuilder userB = new UserBuilder().with((ub) -> {
			ub.setName("Sachin");
			ub.setAddress("SN192");
			
			ub.setMobile("9983343456");
		});
		
		User user = userB.with((ub) -> {
			ub.setId(11);
		}).build();
		
		System.out.println(user);
	}

}
