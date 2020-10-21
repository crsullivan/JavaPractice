/**
 * 
 */

/**
 * @author crsul
 *
 */
public class OverloadedMethods {

	public static void main(String[] args) {
		//create instance here
		OverloadedMethods om = new OverloadedMethods();
		om.print();
		om.print("Second Print Method.");
		om.print("Second", "Third");
	}
	
	//overload methods here
	public void print() {
		System.out.println("Original Print Method.");
	}
	
	public void print(String str) {
		System.out.println(str);
	}
	
	public void print(String str, String str2) {
		System.out.println(str + " " + str2);
	}
	
//	public void print(String first, String second) {
//		System.out.println(first + " " + second);
//	}
}
