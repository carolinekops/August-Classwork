
public class Dog {
	
	private String color;
	private String name;
	private String breed;
	private int hungry;
	private int energy;
	
	//I only created getters for attributes that cannot be influenced by Owner class
	public String getColor() {
		return color;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public int getHungry() {
		return hungry;
	}
	public void setHungry(int hungry) {
		this.hungry = hungry;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	//constructor for dogs with all attributes 
	Dog(String color, String name, String breed, int hungry, int energy){
		this.color = color;
		this.name = name;
		this.breed = breed;
		this.hungry = hungry;
		this.energy = energy;
		
	}
	//sleep instance method. i printed it out in the intance method because i could not figure out how to do it in the main 
	void Sleep() {
		setHungry(++this.hungry);
		setEnergy(++this.energy);
		System.out.println(getHungry() + ":" + getEnergy());
	}
	//eat instance method
	void Eat() {
		setHungry(--this.hungry);
		setEnergy(--this.energy);
		System.out.println(getHungry() + ":" + getEnergy());
	}
//not sure how i would invoke it if it was private like you wanted
	String Bark() {
		String bark = "Bow wow";
		System.out.println(bark);
		return bark;
	}
	public String toString() {
		return(this.color  + "\n" + this.name  + "\n" + this.breed  + "\n" + this.hungry  + "\n" + this.energy);
	}
}