package com.netcracker.edu.java.tasks;

public class Runner {

	public static void main(String[] args) {

		System.out.println("Hello, World!");
		
		ZeroTaskImpl zt = new ZeroTaskImpl();

		zt.setIntegerValue(5);
		
		double d = zt.getDoubleValue();		
		
		System.out.println(d);
		System.out.println(zt.number);

	}

}
