/**
 * 
 */
package ru.ncedu.java.tasks;

/**
 * @author alitvin
 *
 */
public class EmployeeImpl implements Employee {
	
	private String employeeFirstName;
	private String employeeLastName;
	private int employeeSalary;
	

	/**
	 * 
	 */
	public EmployeeImpl() {
		// TODO Auto-generated constructor stub
		employeeSalary = 1000;
	}

	/**
	 * @return Зарплата сотрудника на настоящий момент.
	 */
	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return employeeSalary;
	}

	/**
	 * Увеличивает зарплату сотрудника на заданное значение
	 * @param value Значение, на которое нужно увеличить
	 */
	@Override
	public void increaseSalary(int value) {
		// TODO Auto-generated method stub
		employeeSalary += value;

	}

	/**
	 * @return Имя сотрудника
	 */
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return employeeFirstName;
	}

	/**
	 * Устанавливает имя сотрудника
	 * @param firstName Новое имя
	 */
	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		employeeFirstName = firstName;

	}

	/**
	 * @return Фамилия сотрудника
	 */
	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return employeeLastName;
	}

	/**
	 * Устанавливает фамилию сотрудника
	 * @param lastName Новая фамилия
	 */
	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		employeeLastName = lastName;

	}

	/**
	 * @return Имя и затем фамилия сотрудника, разделенные символом " " (пробел)
	 */
	@Override
	public String getFullName() {
		// TODO Auto-generated method stub
		return employeeFirstName + " " + employeeLastName;
	}

	/**
	 * Устанавливает Менеджера сотрудника.
	 * @param manager Сотрудник, являющийся менеджером данного сотрудника. 
	 * НЕ следует предполагать, что менеджер является экземпляром класса EmployeeImpl.
	 */
	@Override
	public void setManager(Employee manager) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return Имя и фамилия Менеджера, разделенные символом " " (пробел).
	 * Если Менеджер не задан, возвращает строку "No manager".
	 */
	@Override
	public String getManagerName() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Возвращает Менеджера верхнего уровня, т.е. вершину иерархии сотрудников, 
	 *   в которую входит данный сотрудник.
	 * Если над данным сотрудником нет ни одного менеджера, возвращает данного сотрудника.
	 * Замечание: поскольку менеджер, установленный методом {@link #setManager(Employee)},
	 *   может быть экзепляром другого класса, при поиске топ-менеджера нельзя обращаться
	 *   к полям класса EmployeeImpl. Более того, поскольку в интерфейсе Employee не объявлено
	 *   метода getManager(), поиск топ-менеджера невозможно организовать в виде цикла.
	 *   Вместо этого нужно использовать рекурсию (и это "более объектно-ориентированно").
	 */
	@Override
	public Employee getTopManager() {
		// TODO Auto-generated method stub
		return null;
	}

}
