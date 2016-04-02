package ru.ncedu.java.tasks;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, World!");
		// Такой метод создания экземпляра дан в Task Description 
		// упражнения Control Flow Statements 1
		Employee dude = new EmployeeImpl();

		dude.setFirstName("Иван");
		dude.setLastName("Кадило");
		
		System.out.println(dude.getFullName());
		System.out.println(dude.getSalary());
		System.out.println(dude.getManagerName());
		
		dude.increaseSalary(500);		
		System.out.println(dude.getSalary());
		
		Employee boss = new EmployeeImpl("отец","Фотий");
		System.out.println(boss.getFullName());
		System.out.println(boss.getSalary());		
		dude.setManager(boss); // назначим менеджера
		System.out.println(dude.getManagerName()); // кто босс?
		
	}

}
