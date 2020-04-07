package com.pattern.builder;

public class User {


	private String name;
	private Integer id;
	private String mobile;
	private String address;
	public User(String name, Integer id, String mobile, String address) {
		super();
		this.name = name;
		this.id = id;
		this.mobile = mobile;
		this.address = address;
	}
	public User(UserBuilder ub) {
		this(ub.getName(), ub.getId(), ub.getMobile(), ub.getAddress());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
	
	

}
