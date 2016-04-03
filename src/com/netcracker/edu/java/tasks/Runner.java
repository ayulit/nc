package com.netcracker.edu.java.tasks;

public class Runner {

	public static void printFormatted(ComplexNumber z) {
		System.out.println("z=" + z.getRe() +(z.getIm() < 0 ? "" : "+") + z.getIm() + "i" );		
	}
	
	public static void main(String[] args) {

		System.out.println("Hello, World!");
		
		ComplexNumber z = new ComplexNumberImpl();		
		//System.out.println("z=" + z.getRe() +(z.getIm() < 0 ? "" : "+") + z.getIm() + "i" );
		printFormatted(z);
		z = new ComplexNumberImpl(2,-3);
		printFormatted(z);
		System.out.println("z is " + (z.isReal() ? "real" : "complex"));
		z.set(5,0);
		printFormatted(z);
		System.out.println("z is " + (z.isReal() ? "real" : "complex"));
		z.set("5.0"); printFormatted(z);
		z.set("i"); printFormatted(z);
		z.set("+i"); printFormatted(z);
		z.set("-i"); printFormatted(z);
		z.set("2.5i"); printFormatted(z);
		z.set("+2.5i"); printFormatted(z);
		z.set("-2.5i"); printFormatted(z);
		
		System.out.println("--------task cases---------");
		
		z.set("i"); printFormatted(z);
		z.set("-3i"); printFormatted(z);
		z.set("3"); printFormatted(z);
				
		System.out.println("--------general cases---------");
		
		z.set("-5+2i"); printFormatted(z);
		z.set("1+i"); printFormatted(z);
		z.set("+4-i"); printFormatted(z);
		z.set("-4.3-i"); printFormatted(z);
		
		System.out.println("----------------------------");
		
		
	}

}
