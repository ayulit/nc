/**
 * 
 */
package ru.ncedu.java.tasks;

/**
 * @author alitvin
 *
 */
public class EmployeeImpl implements Employee {
	
	String employeeFirstName;
	String employeeLastName;
	

	/**
	 * 
	 */
	public EmployeeImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return �������� ���������� �� ��������� ������.
	 */
	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * ����������� �������� ���������� �� �������� ��������
	 * @param value ��������, �� ������� ����� ���������
	 */
	@Override
	public void increaseSalary(int value) {
		// TODO Auto-generated method stub

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

	}

	/**
	 * @return ��� � ������� ���������, ����������� �������� " " (������).
	 * ���� �������� �� �����, ���������� ������ "No manager".
	 */
	@Override
	public String getManagerName() {
		// TODO Auto-generated method stub
		return null;
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
