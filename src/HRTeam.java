import java.util.Scanner;
public class HRTeam {

		public static void main(String args[]) {
			Employee joey = new Employee("Joey", 100, 44.90, "HOURLY", "09-01-2016", "PART-TIME", 128);
			System.out.println(joey.getSsn()); //returns as null
			if(joey.getSsn() == null) {
				Scanner keyboard = new Scanner(System.in);
				System.out.println("What is " + joey.getName() + "'s SSN" );
				joey.setSsn(keyboard.nextLine());
			}
		System.out.println(joey.getSsn());
		}
}
