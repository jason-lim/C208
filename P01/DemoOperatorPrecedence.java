/*
 * @author Shang Ong
 * 
 * This class provides an example which tests Mathematic Operators.
 */

public class DemoOperatorPrecedence {

	public static void main(String[] args) {
		
		System.out.println("Is x = 5 + 5 * 2, 10 multiplied by 2?");
		System.out.println("Or is x = 5 + 5 * 2, 5 plus 10?");
		
		//Observe the results 
		System.out.println(5 + 5 * 2); 
		System.out.println((5 + 5) * 2 );
		
	}// end of main method
}// end of class

