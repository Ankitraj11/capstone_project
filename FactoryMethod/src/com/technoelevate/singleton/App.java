package com.technoelevate.singleton;

public class App {
   public static void main(String[] args) {
	SingleTon singleTon=SingleTon.getSingletonObject();
	System.out.println(singleTon);
	SingleTon singleTon2=SingleTon.getSingletonObject();
	System.out.println(singleTon2);
	if(singleTon.equals(singleTon2)) {
		System.out.println("some object");
	}
}
}
