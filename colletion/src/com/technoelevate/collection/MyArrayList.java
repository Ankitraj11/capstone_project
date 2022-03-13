package com.technoelevate.collection;

public class MyArrayList {
  private Object[] array;
  private int position;
  public MyArrayList(int arraySize) {
	  this.array=new Object[arraySize];
	  
  }
  public void add(Object element) {
	  if(position>=array.length) {
		  grow();
	  }
	  this.array[position++]=element;
  }
  public  Object get(int index) {
	  return this.array[index];
	  
  }
  public int size() {
	  return this.position;
  }
  private void grow() {
	  Object[] temp=new Object[this.array.length+3];
	  System.arraycopy(array, 0, temp, 0, array.length);
	  this.array=temp;
  }
  @Override
  public String toString() {
	  String string="["+array[0];
	  for(int i=1;i<array.length-1;i++) {
		  string+=","+array[i];
	  }
	  string +="]";
	  return string;
  }
}
