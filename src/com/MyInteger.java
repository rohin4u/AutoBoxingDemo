package com;

public class MyInteger{
	
	Integer i;
	MyInteger(Integer i){
		
		this.i=i;
		Integer i1 = i.valueOf(i);
		System.out.println(i1);
		
	}
	public String toString() {
		
		return i+"";
	}
	
	public static void main(String[] args) {
		
		Integer i = new Integer(30);
		MyInteger i1 = new MyInteger(i);
		
		System.out.println(i1);
		
		Integer i2 = Integer.valueOf(10);
		
		Long l = new Long("12.23");
		l=i2;
		
		
		
		
		
		
		
		
		
	}

}
