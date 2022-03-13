package com.technoelevate.factoryMethod;

import java.util.Scanner;


public class ShapeFactory {

	public  static Shape getShape()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter shape");
		String shape=scanner.next();
		
		if(shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle ();
		}
		else if(shape.equalsIgnoreCase("triange")) {
			return new Triangle();
		}
		else if(shape.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		return  null;
	}
	
}
