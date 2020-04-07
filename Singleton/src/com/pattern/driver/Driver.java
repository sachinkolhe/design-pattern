package com.pattern.driver;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.pattern.singleton.DBInstance;

public class Driver {

	public static void main(String[] args) {

		
		DBInstance instance = DBInstance.createInstance();
		System.out.println(instance);
		
		DBInstance instance2 = DBInstance.createInstance();
		System.out.println(instance2);
		
		
		/*
		 * Case 1 - Multi-Threading
		 * */
		
//		new Thread( () ->  {
//			System.out.println(DBInstance.createInstance());
//		}).start();
//
//		new Thread( () ->  {
//			System.out.println(DBInstance.createInstance());
//		}).start();
		
	
		/*
		 * Case 2: Cloning
		 * */
//		DBInstance instance = DBInstance.createInstance();
//		System.out.println(instance);
//		try {
//			Object clone = instance.clone();
//			System.out.println(clone);
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		/*
		 * Case 3: Serialization
		 * */
//		DBInstance instance = DBInstance.createInstance();
//		System.out.println(instance);
//		try {
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myfile.ser"));
//			oos.writeObject(instance);
//			
//			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myfile.ser"));
//			DBInstance readObject = (DBInstance)ois.readObject();
//			
//			System.out.println(readObject);
//		} catch (IOException | ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		/*
		 * Case 4: Reflection
		 * */
		
//		Class<? extends DBInstance> clazz = DBInstance.class;
//		try {
//			Constructor<? extends DBInstance> declaredConstructor = clazz.getDeclaredConstructor();
//			declaredConstructor.setAccessible(true);
//			DBInstance newInstance2 = declaredConstructor.newInstance();
//			
//			System.out.println(newInstance2);
//		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		DBInstance instance = DBInstance.createInstance();
//		System.out.println(instance);
		
		
		
	}

}
