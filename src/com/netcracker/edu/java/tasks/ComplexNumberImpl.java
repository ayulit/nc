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
		this.set(value);
	}
	
	public ComplexNumber clone() throws CloneNotSupportedException {
		
		//ArrayVector copy = new ArrayVectorImpl(vec.clone());	
		return null;
	}

	@Override
	public double getRe() {
		// TODO Auto-generated method stub
		return re;
	}

	@Override
	public double getIm() {
		// TODO Auto-generated method stub
		return im;
	}

	@Override
	public boolean isReal() {
		// TODO Auto-generated method stub
		if (im == 0) {
			return true;
		} 
		else {
			return false;	
		}		
	}

	@Override
	public void set(double re, double im) {
		// TODO Auto-generated method stub
		this.re = re;
		this.im = im;
	}

	@Override
	public void set(String value) throws NumberFormatException {
		// TODO Auto-generated method stub
		
		this.re = 0;
		this.im = 0;
		
		if (!value.isEmpty()) {

			if (value.endsWith("i"))
			{
				// is complex
				if (value.length() == 1)
				{
					// i
					this.im = 1;
				}
				else if ((value.length() == 2) && ((value.startsWith("+")) || (value.startsWith("-"))))
				{
					// +i, -i
					this.im = (value.startsWith("+")) ? 1 : -1;
				}
				else if ((value.indexOf('+', 1) == -1) && (value.indexOf('-', 1) == -1))
				{
					// image only: +234i, -3.5i,
					this.im = Double.parseDouble(value.substring(0, value.length()-1));
					
				}
				else
				{
					// General issue				
					int signInd = (value.indexOf('+', 1) == -1) ? value.indexOf('-', 1) : value.indexOf('+', 1);
					
					// got real
					this.re = Double.parseDouble(value.substring(0, signInd));
										
					String imString = value.substring(signInd, value.length()-1);
					
					if (imString.length() == 1) {
						// got image: xxx+i, xxx-i 
						this.im = (imString.equals("+")) ?  (1) : (-1);
						
					} 
					else 
					{
						// got it
						this.im = Double.parseDouble(imString);
					}			
				}			
			}
			else
			{
				// is real
				this.re = Double.parseDouble(value);
			}			
			
		}

	}
	
	public boolean equals(Object other){
		
		if ((other instanceof ComplexNumber) &&
			(this.re == ((ComplexNumberImpl)other).re) && 
			(this.im == ((ComplexNumberImpl)other).im))
		{
			return true;
		}	 
		
		return false;		
	}

	@Override
	public ComplexNumber copy() {
		// TODO Auto-generated method stub
		ComplexNumber copyOfComplexNumber = new ComplexNumberImpl(this.re,this.im);	
		return copyOfComplexNumber;		
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
