import java.util.Scanner;

public class Employee {
	
	private String name;
	private int employeeId;
	double salary;
	private String payRate;
	private String joinDate;
	private String typeOfEmployee;
	int hours;
	private String ssn;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getPayRate() {
		return payRate;
	}

	public void setPayRate(String payRate) {
		this.payRate = payRate;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public String getTypeOfEmployee() {
		return typeOfEmployee;
	}

	public void setTypeOfEmployee(String typeOfEmployee) {
		this.typeOfEmployee = typeOfEmployee;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getSalary() {
		return salary;
	}

	//Constructor for objects with all attributes
	Employee(String name, int employeeId, double salary, String payRate, String joinDate, String typeOfEmployee, int hours) {
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
		this.payRate = payRate;
		this.joinDate= joinDate;
		this.typeOfEmployee = typeOfEmployee;
		this.hours = hours;
	}
	
	void setSalary(double newSalary) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your HR code to set salary");
		int hrCode = keyboard.nextInt();
		if(hrCode == 3391);
			this.salary = newSalary;
	}
	
	//Constructor for employees that do not have an ID number or hours
	Employee(String name, double salary, String payRate, String joinDate, String typeOfEmployee) {
		this.name = name;
		this.salary = salary;
		this.payRate = payRate;
		this.joinDate= joinDate;
		this.typeOfEmployee = typeOfEmployee;
	}
	//Methods: compared salary of current object with that of the object sent to it
	//this is the first object, another is second
	void compareSalary(Employee another) {
		if(this.salary > another.salary) {
			System.out.println(this.name + "has a higher salary than" + another.name);
		}
	}
	/*
	//toString method in order to print objects as strings
	public String toString() {
		return(this.name + "\n" + this.employeeId + "\n" + this.salary + "\n" + this.payRate + "\n" + this.joinDate + "\n" + this.typeOfEmployee + "\n" + this.hours);
	}
	*/
}
