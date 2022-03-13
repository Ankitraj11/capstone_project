package com.technoelevate.singleton;

public class SingleTon {

	private static SingleTon singleton;
	private SingleTon() {
		
	}
	public static synchronized SingleTon getSingletonObject() {
		if(singleton==null) 
			singleton=new SingleTon();
		 return singleton;
		
	
	}
}
