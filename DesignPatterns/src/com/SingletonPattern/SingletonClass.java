package com.SingletonPattern;

public class SingletonClass {
	
	private static SingletonClass instance;//Static instance variable
	
	private SingletonClass(){}//Private constructor to avoid explicit instantiation
	
	public static SingletonClass getInstance(){//Static method to get instance
		if(instance == null){
			instance = new SingletonClass();
		}
		return instance;
	}
}
