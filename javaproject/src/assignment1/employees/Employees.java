package assignment1.employees;

public class Employees {
	private String name;
	private String employeeId;
	public double salary;
	
	
	public Employees(String name,String employeeId,double salary) {
		this.name=name;
		this.employeeId=employeeId;
		this.salary=salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String empprint() {
		return "Employees [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + "]";
	}

	public String dis() {
		// TODO Auto-generated method stub
		return null;
	}

	public String disman() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
