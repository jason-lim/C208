
public class DemoHelper {

	public static void main(String[] args) {
		
		//Input using Helper class
		String name = Helper.readString("Enter your name > "); 

		//Output
		System.out.println("Collected the input and this is the output***\nHi, I'm " + name);

	}

}


