package com.netcracker.edu.java.tasks;

public class ComplexNumberImpl implements ComplexNumber {
	
	private double re;
	private double im;

	public ComplexNumberImpl() {
		// TODO Auto-generated constructor stub
		re=0;
		im=0;
	}
	
	public ComplexNumberImpl(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	public ComplexNumberImpl(String value) {
		this();
	}
	
	public ComplexNumber clone() throws CloneNotSupportedException {
		
		//ArrayVector copy = new ArrayVectorImpl(vec.clone());	
		return null;
	}

	@Override
	public double getRe() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getIm() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isReal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void set(double re, double im) {
		// TODO Auto-generated method stub

	}

	@Override
	public void set(String value) throws NumberFormatException {
		// TODO Auto-generated method stub

	}

	@Override
	public ComplexNumber copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(ComplexNumber other) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sort(ComplexNumber[] array) {
		// TODO Auto-generated method stub

	}

	@Override
	public ComplexNumber negate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComplexNumber add(ComplexNumber arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComplexNumber multiply(ComplexNumber arg2) {
		// TODO Auto-generated method stub
		return null;
	}

}
