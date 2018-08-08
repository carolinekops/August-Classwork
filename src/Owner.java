
public class Owner {
/*
 * private String color;
	private String name;
	private String breed;
	private int hungry;
	private int energy
 */
	public static void main(String args[]) {
		Dog Gracie = new Dog("Blonde","Gracie", "Toy Poodle", 8, 4);
		Dog Riley = new Dog("Black","Riley", "Toy Poodle", 6, 9);
		Dog Doug = new Dog("Tan","Doug", "Pug", 3, 5);
		Dog Winnie = new Dog("Brown","Winnie", "Woodle", 3, 10);
		
		Riley.Eat();
		Riley.Sleep(); //the attributes are changed in heap which is what I want since the dog's hunger and tiredness changes
		Gracie.Sleep();
		Doug.Eat();
		Winnie.Sleep();
		//demonstrating toString 
		System.out.println(Winnie);
	}

}
