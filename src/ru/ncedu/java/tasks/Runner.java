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
		System.out.println("ФИО сотрудника:" + dude.getFullName());
		System.out.println("ЗП сотрудника:" + dude.getSalary());
		System.out.println("ФИО менеджера:" + dude.getManagerName());
				
		Employee boss = new EmployeeImpl("отец","Фотий");
		System.out.println("ФИО менеджера:" + boss.getFullName());
		System.out.println("ЗП менеджера сотрудника:" + boss.getSalary());
		boss.increaseSalary(500);		
		System.out.println("ЗП менеджера повысилась:" + boss.getSalary());
		
		dude.setManager(boss); // назначим менеджера
        // кто босс? отец Фотий
		System.out.println("ФИО менеджера:" + dude.getManagerName());
		
		// кто менеджер босса? No manager
		System.out.println("ФИО менеджера менеджера:" + boss.getManagerName());		
		// кто топ босса? он сам
		System.out.println("ФИО топа менеджера:" + boss.getTopManager().getFullName());
		// кто топ чувака? пока босс
		System.out.println("ФИО топа сотрудника:" + dude.getTopManager().getFullName());
				
		// назначим менеджеру босса, т.е. будет топ
		Employee top = new EmployeeImpl("Патриарх","Кирилл");
		boss.setManager(top);			
		// кто топ чувака? пока босс
		System.out.println("ФИО топа сотрудника:" + dude.getTopManager().getFullName());
		
		
	}

}
