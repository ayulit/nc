package ru.ncedu.java.tasks;

public class ArrayVectorImpl implements ArrayVector {
	
	private double[] vec;

	public ArrayVectorImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayVectorImpl clone() {
		return null;
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
		return 0;
	}

	@Override
	public void set(int index, double value) {
		// TODO Auto-generated method stub

	}

	@Override
	public double get(int index) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sortAscending() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mult(double factor) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayVector sum(ArrayVector anotherVector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double scalarMult(ArrayVector anotherVector) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getNorm() {
		// TODO Auto-generated method stub
		return 0;
	}

}
