// This program will show the student how to declare,assign and
// use an integer variable.  An integer variable will be
// declared and its value set. After which the value will be
// displayed on the console. After which a new value will be 
// assigned, and then re-displayed on the console.

// Declare the class
public class IntSample 
{

	public static void main(String[] args) 
	{
		// declare an integer (keyword int)
		int number;
		// set (assign ) the value 42
		number = 42;
		// Now display the number to stdout
		System.out.println("The answer to life, the universe and everything: " + number);
		// now reset (change) the value of the variable
		number = 73;
		// now display the new value
		System.out.println("The new number is: " + number);
		
	}

}
