/*
1. Create a vehicle class - you can google for it's attributes and behaviors

2. Create at least 2 instance methods

3. Create main function inside the same class

4. Create 5 vehicle objects 

5. Create at least 4 constructors including a default constructor that doesn't do anything(meaning, the default constructor sets everything to JVM's default values)
*/

import java.util.Scanner;
public class Vehicle {
	public Scanner keyboard = new Scanner(System.in);
	private String owner;
	private String brand;
	private String model;
	private int year;
	private String color;
	private int mpg;
	private int currentSpeed;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMpg() {
		return mpg;
	}
	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
	
	//Defaut Constructor
	Vehicle(){	
	}
	
	//Constructor with all attributes
	Vehicle(String owner, String brand,String model, int year, String color, int mpg, int currentSpeed){
		this.owner = owner;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.color = color;
		this.mpg = mpg;
		this.currentSpeed = currentSpeed;
	}
	//Constructor without brand or model attribute
	Vehicle(String owner, String brand ,int year, String color, int mpg) {
		this.owner = owner;
		this.brand = brand;
		this.year = year;
		this.color = color;
		this.mpg = mpg;
	}
	//Constructor with only mpg and current speed
	Vehicle(String owner, String brand ,int mpg, int currentSpeed){
		this.owner = owner;
		this.brand = brand;
		this.mpg = mpg;
		this.currentSpeed = currentSpeed;
	}
	//toString method in order to print an object's attributes as a String
	public String toString() {
		return(this.getOwner() + "\n" + this.getBrand() + "\n" +this.getModel()+"\n"+this.getYear()+"\n"+this.getColor()+"\n"+this.getMpg()+"\n"+this.getCurrentSpeed());

	}
	//Instance method that finds out who is driving faster
	public void whosFaster(Vehicle another) {
		if(this.getCurrentSpeed() > another.getCurrentSpeed()) {
			System.out.println(this.getOwner() + " is driving faster than " + another.getOwner() + ".  They should slow down!");
			}
		else if(this.getCurrentSpeed() < another.getCurrentSpeed()) {
			System.out.println(this.getOwner() + " is driving slower than " + another.getOwner() + ".  They should speed up!");
		}
		else {
			System.out.println("I need both car's speeds to know who is faster.");
		}
	}	
	//Instance method that calculates which car used more gallons of gas
	public void howManyGallons(Vehicle another){

		int anotherhowManyGallons = another.getCurrentSpeed() / another.getMpg();
		int thishowManyGallons = this.getCurrentSpeed() / this.getMpg();
		
		if(thishowManyGallons > anotherhowManyGallons) {
			System.out.println(this.getOwner() + " used more gallons of gas than " + another.getOwner());
		}
		else if(thishowManyGallons < anotherhowManyGallons) {
			System.out.println(this.getOwner() + " used less gallons of gas than " + another.getOwner());
		}
	}
	
	public void whoIsFanciest() {
		switch(this.getBrand()) {
			case "BMW" :
				System.out.println("Jay has a fancier car than everyone but Emily.");
			case "Honda" :
				System.out.println("Jay, Emily, and Caroline have fancier cars than Alex. Alex has a fancier car than Annie.");
				break;
			case "Scion" :
				System.out.println("Annie has the least fancy car.");
				break;
			case "Maserati" :
				System.out.println("Emily has the fanciest car, and therefore is probably very rich.");
				break;
			default:
				System.out.println("It is unclear what brand of car this person has.");
				break;
		}
	}
	
	public static void main(String args[]){
		//Create objects
		Scanner keyboard = new Scanner(System.in);
		Vehicle Caroline = new Vehicle("Caroline", "Subaru", "Crosstrek", 2017, "Blue", 27, 81);
		Vehicle Alex = new Vehicle("Alex", "Honda","Civic", 2014, "Silver", 26, 104);
		Vehicle Jay = new Vehicle("Jay","BMW" ,2013, "Red", 20);
		Vehicle Annie = new Vehicle("Annie","Scion",2016, "Silver", 33);
		Vehicle Emily = new Vehicle("Emily","Maserati",28, 56);
		Vehicle Taylor = new Vehicle();
		
		//Different methods the code can execute
				Caroline.whosFaster(Alex);
				Caroline.whosFaster(Taylor);
				Emily.howManyGallons(Alex);
				Alex.howManyGallons(Caroline);
				System.out.println(Alex.toString());
				Alex.whoIsFanciest();
			
		
		
		/*_____________________________________________
		 * something I was trying to do and will ask you about a different day.
		System.out.println("What do you want to know about these drivers? 1.Speed, 2.gallons of gas used, or 3.who is the fanciest? Please select a number.");
		int choice = keyboard.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Pick either " + Caroline.getOwner() + ", " + Alex.getOwner()+ ", " + Jay.getOwner()+", " + Annie.getOwner() + " or " + Emily.getOwner() +  " as your first driver.");
				String driver1 = keyboard.nextLine();
				System.out.println("Good choice! Now pick your second driver.  " + Caroline.getOwner() + ", " + Alex.getOwner()+ ", " + Jay.getOwner()+", " + Annie.getOwner() + ", or " + Emily.getOwner());
				String driver2 = keyboard.nextLine();	
				break;

			case 2:
				System.out.println();
				break;
			case 3:
				System.out.println();
				break;	
			}
	*/	
	}
	
}