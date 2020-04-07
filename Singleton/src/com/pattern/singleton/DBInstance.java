package com.pattern.singleton;

import java.io.ObjectInputStream;
import java.io.Serializable;

public class DBInstance implements Cloneable, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7249518019136423554L;

	// private constructor
	// so no other class can construct a new object apart from this class
	private DBInstance() {
		if(instance != null) {
			throw new IllegalAccessError();
		}
	}

	
	
	//private static final DBInstance instance = new DBInstance();
	
	private static DBInstance instance = new DBInstance();

	public static DBInstance createInstance() {

		if (instance == null) {
			synchronized (DBInstance.class) {
				if (instance == null)
					instance = new DBInstance();
			}
		}
		return instance;

	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	//returning the same object
		return this;
	}
	
	private void readObject(ObjectInputStream ois) throws Exception {
		throw new IllegalAccessError();
	}

}
