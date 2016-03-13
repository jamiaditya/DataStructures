package com.SingletonPattern;

public class SingletonClass {
	
	private static SingletonClass instance;//Static instance variable
	
	private SingletonClass(){}//Private constructor to avoid explicit instantiation

	// This method is synchronized to make it thread safe;
	public static synchronized SingletonClass getInstance(){//Static method to get instance
		if(instance == null){
			instance = new SingletonClass();
		}
		return instance;
	}
}
