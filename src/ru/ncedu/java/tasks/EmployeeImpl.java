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
	private Employee employeeManager;
	

	public EmployeeImpl() {
		// TODO Auto-generated constructor stub
		employeeSalary = 1000;
		employeeManager = null;
	}
	
	public EmployeeImpl(String firstName, String lastName) {
		// TODO Auto-generated constructor stub
		this();
		employeeFirstName = firstName;
		employeeLastName = lastName;
	}
	

	/**
	 * @return �������� ���������� �� ��������� ������.
	 */
	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return employeeSalary;
	}

	/**
	 * ����������� �������� ���������� �� �������� ��������
	 * @param value ��������, �� ������� ����� ���������
	 */
	@Override
	public void increaseSalary(int value) {
		// TODO Auto-generated method stub
		employeeSalary += value;
	}

	/**
	 * @return ��� ����������
	 */
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return employeeFirstName;
	}

	/**
	 * ������������� ��� ����������
	 * @param firstName ����� ���
	 */
	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		employeeFirstName = firstName;

	}

	/**
	 * @return ������� ����������
	 */
	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return employeeLastName;
	}

	/**
	 * ������������� ������� ����������
	 * @param lastName ����� �������
	 */
	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		employeeLastName = lastName;

	}

	/**
	 * @return ��� � ����� ������� ����������, ����������� �������� " " (������)
	 */
	@Override
	public String getFullName() {
		// TODO Auto-generated method stub
		return employeeFirstName + " " + employeeLastName;
	}

	/**
	 * ������������� ��������� ����������.
	 * @param manager ���������, ���������� ���������� ������� ����������. 
	 * �� ������� ������������, ��� �������� �������� ����������� ������ EmployeeImpl.
	 */
	@Override
	public void setManager(Employee manager) {
		// TODO Auto-generated method stub
		employeeManager = manager;

	}

	/**
	 * @return ��� � ������� ���������, ����������� �������� " " (������).
	 * ���� �������� �� �����, ���������� ������ "No manager".
	 */
	@Override
	public String getManagerName() {
		// TODO Auto-generated method stub
		if (employeeManager == null){
			return "No manager";
		}
		return employeeManager.getFullName();
	}

	/**
	 * ���������� ��������� �������� ������, �.�. ������� �������� �����������, 
	 *   � ������� ������ ������ ���������.
	 * ���� ��� ������ ����������� ��� �� ������ ���������, ���������� ������� ����������.
	 * ���������: ��������� ��������, ������������� ������� {@link #setManager(Employee)},
	 *   ����� ���� ���������� ������� ������, ��� ������ ���-��������� ������ ����������
	 *   � ����� ������ EmployeeImpl. ����� ����, ��������� � ���������� Employee �� ���������
	 *   ������ getManager(), ����� ���-��������� ���������� ������������ � ���� �����.
	 *   ������ ����� ����� ������������ �������� (� ��� "����� ��������-��������������").
	 */
	@Override
	public Employee getTopManager() {
		// TODO Auto-generated method stub
		return null;
	}

}
