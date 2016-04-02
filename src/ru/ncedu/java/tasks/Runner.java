package ru.ncedu.java.tasks;

import java.util.Arrays;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
		
		ArrayVector vect = new ArrayVectorImpl();
		
		vect.set(-1,2,3,4,5);
				
		System.out.println("vector: " + Arrays.toString(vect.get()));
		System.out.println("size: " + vect.getSize());
		
		vect.set(0, 10);
		System.out.println("vector: " + Arrays.toString(vect.get()));
		System.out.println("size: " + vect.getSize());
		
		System.out.println("element = " + vect.get(0));
		
		System.out.println("max = " + vect.getMax());
		System.out.println("min = " + vect.getMin());
		
		vect.sortAscending();
		System.out.println("sort: " + Arrays.toString(vect.get()));
		
		vect.mult(2.0); // let's multiply by two
		System.out.println("multiply: " + Arrays.toString(vect.get()));
		
		ArrayVector dopel = vect.clone();
		dopel.mult(2.0); // let's multiply by two
		System.out.println("original: " + Arrays.toString(vect.get()));
		System.out.println("cloned*2: " + Arrays.toString(dopel.get()));	
		
		vect = vect.sum(dopel); // let's add
		System.out.println("summed: " + Arrays.toString(vect.get()));
		
		System.out.println("----------------------------------");
		
		ArrayVector av1 = new ArrayVectorImpl(1,2,3);
		ArrayVector av2 = new ArrayVectorImpl(1,2,3,4,5);
		ArrayVector bv1 = new ArrayVectorImpl(10,20,30,40,50);
		ArrayVector bv2 = new ArrayVectorImpl(10,20,30);
		av1 = av1.sum(av2);
		bv1 = bv1.sum(bv2);		
		System.out.println("av1: " + Arrays.toString(av1.get())); // 2,4,6
		System.out.println("bv1: " + Arrays.toString(bv1.get())); // 20,40,60,40,50
		
		
		

	}

}
