
public class Payroll {
	
	//Pay-cycle is biweekly. function will calculate employee's paycheck
	//if employee is FULL-TIME, 
	public static double calculatePay(Employee current) { //current is what we are naming the employee that does thru method
	
	double salary;
		if(current.payRate == "YEARLY") {
			salary = (current.salary/52) * 2;
		}
		else if (current.payRate== "HOURLY") {
			salary = (current.salary * current.hours * 2);
		}
		else {
			salary = 0.0;
		}
	return salary;
	}
	public static void main(String args[]) {
		
		//Call objects
		//(String name, int employeeId, double salary, String payRate, String joinDate, String typeOfEmployee, int hours)
		Employee tom = new Employee("Tom Haverford", 100, 44.90, "HOURLY", "09-01-2016", "PART-TIME", 128); //Must be in the same order as constructor
			//System.out.println(tom.salary); //attribute needs to be not private (default) to be seen in this class
		
		//String name, double salary, String payRate, String joinDate, String typeOfEmployee
		Employee ron = new Employee("Ron Swanson", 33000, "YEARLY", "08-02-2002", "FULL-TIME");
		
		//System.out.println(ron);
		
		System.out.println(calculatePay(tom));
		System.out.println(calculatePay(ron));
	}
	
}
