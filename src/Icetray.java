
public class Icetray {
	String shape;
	String color;
	String flavor;
	String fill;
	
	Icetray() {
		this.shape = "cube";
		this.color = "white";
		this.flavor = "flavorless";
		this.fill = "water";
	}
	
	Icetray(String shape, String color, String flavor, String fill) {
		this.shape = shape;
		this.color = color;
		this.flavor = flavor;
		this.fill = fill;
	}
	Icetray(String color, String flavor, String fill) {
		this.color = color;
		this.flavor = flavor;
		this.fill = fill;
	}
	Icetray(String shape) {
		this();
		this.shape = shape;
	}
	
	public String toString() {
		return("Color:" + this.color + "\n" + "Shape:" + this.shape + "\n" + "Flavor:" + this.flavor + "\n" + "Fill:" + this.fill);
		
	}
	public static void main(String[] args) {
		Icetray first = new Icetray();
		
		Icetray second = new Icetray("Star", "Red", "Sweet", "Strawberry Water");
			System.out.println(second);
			
		Icetray third = new Icetray("Diamond");
			
		Icetray fourth = new Icetray("black", "cola", "cola");
		
		Icetray fifth = new Icetray("black", "cola", "cola");
			
				
;	}
}
