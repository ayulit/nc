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
		Employee dude = new EmployeeImpl();

		dude.setFirstName("����");
		dude.setLastName("������");
		
		System.out.println(dude.getFullName());
		System.out.println(dude.getSalary());
		System.out.println(dude.getManagerName());
		
		dude.increaseSalary(500);		
		System.out.println(dude.getSalary());
		
		Employee boss = new EmployeeImpl("����","�����");
		System.out.println(boss.getFullName());
		System.out.println(boss.getSalary());		
		dude.setManager(boss); // �������� ���������
		System.out.println(dude.getManagerName()); // ��� ����?
		
	}

}
