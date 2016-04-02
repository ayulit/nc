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
				
		System.out.println(Arrays.toString(vect.get()));

	}

}
