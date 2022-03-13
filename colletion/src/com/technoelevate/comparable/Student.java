package com.technoelevate.comparable;

public class Student implements Comparable<Student>{
    
    int id;
    String name;
    int rollno;
    double marks;
    
	  public Student(int id,String name,int rollNo,double marks) {
	
		  this.id=id;
		  this.name=name;
		  this.rollno=rollNo;
		  this.marks=marks;
		  
	  }
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
	    return this.id-o.id;
	}


	
	
	@Override
  public String toString() {
       return "Student [id="+id + ",rollno="+rollno +",name="+name+",marks="+marks+"]";	
}
}
