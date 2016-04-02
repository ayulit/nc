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
				
		Employee boss = new EmployeeImpl("отец","Фотий");
		System.out.println(boss.getFullName());
		System.out.println(boss.getSalary());
		boss.increaseSalary(500);		
		System.out.println(boss.getSalary());
		
		dude.setManager(boss); // назначим менеджера
		System.out.println(dude.getManagerName()); // кто босс? отец Фотий
		
		// кто менеджер босса? No manager
		System.out.println(boss.getManagerName());		
		// кто топ босса? он сам
		System.out.println(boss.getTopManager().getFullName());
		// кто топ чувака? пока босс
		System.out.println(dude.getTopManager().getFullName());
				
		// назначим менеджеру босса, т.е. будет топ
		Employee top = new EmployeeImpl("Патриарх","Кирилл");
		boss.setManager(top);			
		// кто топ чувака? пока босс
		System.out.println(dude.getTopManager().getFullName());
		
		
	}

}
