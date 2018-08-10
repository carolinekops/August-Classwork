
public class Payroll {
	
	//Pay-cycle is biweekly. function will calculate employee's paycheck
	//if employee is FULL-TIME, 
	public static double calculatePay(Employee current) { //current is what we are naming the employee that does thru method
	
	double salary;
		if(current.getPayRate() == "YEARLY") {
			salary = (current.getSalary()/52) * 2;
		}
		else if (current.getPayRate()== "HOURLY") {
			salary = (current.getSalary() * current.getHours() * 2);
		}
		else {
			salary = 0.0;																
		} 
	return salary;
	
	}
	public static void main(String args[]) {
		int a = 10; //scope is in main function s
		//Call objects
		//(String name, int employeeId, double salary, String payRate, String joinDate, String typeOfEmployee, int hours)
		Employee tom = new Employee("Tom Haverford", 100, 44.90, "HOURLY", "09-01-2016", "PART-TIME", 128); //Must be in the same order as constructor
			//System.out.println(tom.salary); //attribute needs to be not private (default) to be seen in this class
		
		//String name, double salary, String payRate, String joinDate, String typeOfEmployee
		Employee ron = new Employee("bob", 33000, "YEARLY", "08-02-2002", "FULL-TIME");
		Employee joe = new Employee("joe", 33000, "YEARLY", "08-02-2002", "FULL-TIME");
		Employee bill = new Employee("bill", 33000, "YEARLY", "08-02-2002", "FULL-TIME");
		Employee caroline = new Employee("caroline", 33000, "YEARLY", "08-02-2002", "FULL-TIME");
		Employee[] objArray = new Employee[5];
		objArray[0] = tom;
		objArray[1] = ron;
		objArray[2] = joe;
		objArray[3] = bill;
		objArray[4] = caroline;
	for(Employee x: objArray) {
		System.out.println(x.getName());
	}
		//tom.compareSalary(ron);
		
	}
	
}
