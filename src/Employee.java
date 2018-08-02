import java.util.Scanner;

public class Employee {
	private int time;
	private String name;
	private int employeeId;
	double salary;
	String payRate;
	private String joinDate;
	private String typeOfEmployee;
	int hours;
	

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
	
	//toString method in order to print objects as strings
	public String toString() {
		return(this.name + "\n" + this.employeeId + "\n" + this.salary + "\n" + this.payRate + "\n" + this.joinDate + "\n" + this.typeOfEmployee + "\n" + this.hours);
	}
	
}
