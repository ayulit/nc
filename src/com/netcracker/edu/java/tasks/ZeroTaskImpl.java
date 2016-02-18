package com.netcracker.edu.java.tasks;

public class ZeroTaskImpl implements ZeroTask {

	int number;
	
	public ZeroTaskImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setIntegerValue(int value) {
		// TODO Auto-generated method stub
		number = value;
	}
	
	@Override
	public double getDoubleValue() {
		// TODO Auto-generated method stub
		return number;
	}	
}
