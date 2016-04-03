package com.netcracker.edu.java.tasks;

public class Runner {

	public static void printFormatted(ComplexNumber z) {
		System.out.println("z=" + z.getRe() +(z.getIm() < 0 ? "" : "+") + z.getIm() + "i" );		
	}
	
	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

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
		
		System.out.println("----------Copy-----------");
		
		ComplexNumber zumwalt = new ComplexNumberImpl("-5.8+6i");
		printFormatted(zumwalt);
		z = zumwalt;
		System.out.println("'=':Values are" + (zumwalt.equals(z)?" equal. ":" not equal. ") + 
		           "Refs are" + ((zumwalt==z) ?" equal":" not equal. ")); // equal-equal
		z = zumwalt.copy();
		printFormatted(z);
		System.out.println("'copy':Values are" + (zumwalt.equals(z)?" equal. ":" not equal. ") + 
				           "Refs are" + ((zumwalt==z) ?" equal":" not equal. ")); //equal-not equal
		
		System.out.println("----------Clone-----------");
		zumwalt.set("+4-i"); printFormatted(zumwalt);
		z = zumwalt.clone();
		System.out.println("'clone':Values are" + (zumwalt.equals(z)?" equal. ":" not equal. ") + 
		           "Refs are" + ((zumwalt==z) ?" equal":" not equal. ")); //equal-not equal
		
		
		System.out.println("----------toString-----------");
		z.set("12.5-1.0i"); printFormatted(z);
		zumwalt.set("+3.1-2.7i"); printFormatted(zumwalt);
		System.out.println("zumwalt="+zumwalt.toString()); // 3.1-2.7i
		zumwalt.set(z.toString());printFormatted(zumwalt); // 12.5-1.0i
		
		z.set("0.0");zumwalt.set(z.toString());System.out.println("zumwalt="+zumwalt.toString());
		z.set("0.33333i");zumwalt.set(z.toString());System.out.println("zumwalt="+zumwalt.toString());
		
		System.out.println("----------Compare-----------");
		
		ComplexNumber x = new ComplexNumberImpl("2");	
		ComplexNumber y = new ComplexNumberImpl("3");
		System.out.println(x.toString() + ((x.compareTo(y) > 0)?" > ":" <= ") + y.toString());
		
		x.set("-5+12i");y.set("3-4i");
		System.out.println(x.toString() + ((x.compareTo(y) > 0)?" > ":" <= ") + y.toString()); // >=
		x.set("-3-4i");y.set("9+12i");
		System.out.println(x.toString() + ((x.compareTo(y) > 0)?" > ":" <= ") + y.toString()); // <=
		x.set("-3+4i");y.set("4-3i");
		System.out.println(x.toString() + ((x.compareTo(y) == 0)?" = ":" != ") + y.toString()); // =
		x.set("-3+4i");y.set("4-13i");
		System.out.println(x.toString() + ((x.compareTo(y) == 0)?" = ":" != ") + y.toString()); // !=
		
		System.out.println("----------Sort-----------");
		
		ComplexNumber[] a = new ComplexNumberImpl[9];
		a[0] = new ComplexNumberImpl("-5+12i");
		a[1] = new ComplexNumberImpl("9-12i");
		a[2] = new ComplexNumberImpl("-3+4i");
		a[3] = new ComplexNumberImpl("1+i");
		a[4] = new ComplexNumberImpl("i");
		a[5] = new ComplexNumberImpl("1-i");
		a[6] = new ComplexNumberImpl("-i");
		a[7] = new ComplexNumberImpl("-100.5");
		a[8] = new ComplexNumberImpl("200");

		x.sort(a);
		
		for (int j=0; j < a.length; j++)
		{
			System.out.println(a[j].toString());
		}
		
		System.out.println("----------Negate-----------");
		System.out.println("x=" + x.toString());
		System.out.println("zumwalt=" + zumwalt.toString());
		zumwalt = x.negate();
		System.out.println("zumwalt=" + zumwalt.toString());
		
		System.out.println("----------Add-----------");
		x.set("-5+6i");
		z.set("3-2i");
		zumwalt = x.add(z);
		System.out.println("zumwalt=" + zumwalt.toString()); // -2+4i
		
		System.out.println("----------Multiplicity-----------");
		zumwalt = x.multiply(z);
		System.out.println("zumwalt=" + zumwalt.toString()); // -3+28i
		x = zumwalt.multiply(zumwalt);
		System.out.println("x=" + x.toString()); // -775-168i 
		
		System.out.println("----------Last Check-----------");
		
		x.set("-5+6i");
		y.set("8-3i");
		
		// z = x-y^2		
		z = x.add(y.copy().multiply(y).negate());
		System.out.println("z=" + z.toString()); // -60+54i
	}

}
