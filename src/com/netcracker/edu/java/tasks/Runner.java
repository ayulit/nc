package com.netcracker.edu.java.tasks;

public class Runner {

	public static void main(String[] args) {

		System.out.println("Hello, World!");
		
		ComplexNumber z = new ComplexNumberImpl();		
		System.out.println("z=" + z.getRe() + "+i*" + z.getIm());
		z = new ComplexNumberImpl(2,-3);
		System.out.println("z=" + z.getRe() + "+i*" + z.getIm());
		System.out.println("z is " + (z.isReal() ? "real" : "complex"));
		z.set(5,0);
		System.out.println("z=" + z.getRe() + "+i*" + z.getIm());
		System.out.println("z is " + (z.isReal() ? "real" : "complex"));
		
		
		
		
		
	}

}
