package com.pattern.builder;

import java.util.function.Consumer;

public class UserBuilder {

	private String name;
	private Integer id;
	private String mobile;
	private String address;
	
//	public UserBuilder name(String name) {
//		this.name = name;
//		return this;
//	}
//	
//	public UserBuilder asId(Integer id) {
//		this.id = id;
//		return this;
//	}
//	
//	public UserBuilder mobile(String mobile) {
//		this.mobile = mobile;
//		return this;
//	}
//	
//	public UserBuilder addr(String addr) {
//		this.address = addr;
//		return this;
//	}
	
	public UserBuilder with(Consumer<UserBuilder> userBuilder) {
		userBuilder.accept(this);
		return this;
	}
	
	
	
	public User build() {
		return new User(this);
	}

	
	
	public void setName(String name) {
		this.name = name;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getName() {
		return name;
	}

	public Integer getId() {
		return id;
	}

	public String getMobile() {
		return mobile;
	}

	public String getAddress() {
		return address;
	}
	
	
	
}
