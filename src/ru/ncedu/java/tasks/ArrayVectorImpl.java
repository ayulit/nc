package ru.ncedu.java.tasks;

import java.util.Arrays;

public class ArrayVectorImpl implements ArrayVector {
	
	private double[] vec;

	public ArrayVectorImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayVectorImpl(double... elements) {
		// TODO Auto-generated constructor stub
		vec = elements;
	}
	
	public ArrayVector clone() {
		
		ArrayVector copy = new ArrayVectorImpl(vec.clone());	
		return copy;
	}

	@Override
	public void set(double... elements) {
		// TODO Auto-generated method stub
		vec = elements;
	}

	@Override
	public double[] get() {
		// TODO Auto-generated method stub
		return vec;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return vec.length;
	}

	@Override
	public void set(int index, double value) {
		// TODO Auto-generated method stub		
		if (index>=0)  {
			if (index > (vec.length - 1)){
				
				double[] tempVec = Arrays.copyOf(vec, index + 1);				
				vec = tempVec;
				
			}
			
			vec[index] = value;	
			
		}
	}

	@Override
	public double get(int index) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return vec[index];
	}

	@Override
	public double getMax() {
		// TODO Auto-generated method stub		
		double max = vec[0];
		
		for (int i = 1; i < vec.length; i++) {
		    if (vec[i] > max) {
		        max = vec[i];
		    }
		}
		
		return max;
	}

	@Override
	public double getMin() {
		// TODO Auto-generated method stub
		double min = vec[0];
		
		for (int i = 1; i < vec.length; i++) {
		    if (vec[i] < min) {
		        min = vec[i];
		    }
		}
		
		return min;
	}

	@Override
	public void sortAscending() {
		// TODO Auto-generated method stub
		Arrays.sort(vec);
	}

	@Override
	public void mult(double factor) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < vec.length; i++) {
		    vec[i] *= factor;
		}

	}

	@Override
	public ArrayVector sum(ArrayVector anotherVector) {
		// TODO Auto-generated method stub
		
		if (anotherVector != null) {
			
			int minLen = Math.min(vec.length, anotherVector.getSize());
			
			for (int i = 0; i < minLen; i++) {
				
				vec[i] += anotherVector.get(i);			    
			}	
		}
		
		return this;
	}

	@Override
	public double scalarMult(ArrayVector anotherVector) {
		// TODO Auto-generated method stub
		
		double product = 0;
		
		if (anotherVector != null) {
			
			int minLen = Math.min(vec.length, anotherVector.getSize());
			
			for (int i = 0; i < minLen; i++) {
				
				product += vec[i] * anotherVector.get(i);			    
			}	
		}
		
		return product;
	}

	@Override
	public double getNorm() {
		// TODO Auto-generated method stub
		return 0;
	}

}
