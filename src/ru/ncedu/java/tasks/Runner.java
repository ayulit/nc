package ru.ncedu.java.tasks;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
		// ����� ����� �������� ���������� ��� � Task Description 
		// ���������� Control Flow Statements 1
		Employee object = new EmployeeImpl();

		object.setFirstName("����");
		object.setLastName("������");
		
		System.out.println(object.getFullName());
		System.out.println(object.getSalary());
		
		object.increaseSalary(500);
		
		System.out.println(object.getSalary());
	}

}
