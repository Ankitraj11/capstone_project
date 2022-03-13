package com.technoelevate.factoryMethod;

import java.util.Scanner;

public class App {

	public static void  main(String[] args) {
		Shape shape=ShapeFactory.getShape();
		ShapeTest test=new ShapeTest();
		test.getShape(shape);
		
		
}
}