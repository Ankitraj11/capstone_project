package com.technoelevate.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentTest {

	public static void main(String[] args) {

		Student student = new Student(8, "pavi", 19, 80);
		Student student1 = new Student(28, "Ankit", 12, 98.34);
		Student student2 = new Student(41, "Anaya", 34, 98.34);
		Student student3 = new Student(20, "Monika", 15, 98.34);
		Student student4 = new Student(44, "Prem", 18, 84.34);
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(student);
		arrayList.add(student1);
		arrayList.add(student4);
		arrayList.add(student3);
		arrayList.add(student2);
		System.out.println(arrayList);
		System.out.println("before sorting");
		for (Student student5 : arrayList) {
			System.out.println(student5);
		}
		System.out.println("--------------");

		Iterator<Student> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("after sorting===");
		Collections.sort(arrayList);
		for (Student student5 : arrayList) {
			System.out.println(student5);
		}

	}
}
