
public class Constructors {
	
	public Constructors() {
		System.out.print("Default Constructor Ran!");
	}
	
	public Constructors(int value) {
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		//create instances here
		Constructors c = new Constructors(5839);
		//use the no arg constructor
		Constructors cNoArg = new Constructors();
	}
	
}
