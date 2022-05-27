// StringUsage.java
// this program will show the student how the String reference variable works.
// This program makes use of one of the String objects methods.

public class StringUsage 
{

	public static void main(String[] args) 
	{
		int wordcount = 0;
		String MyVar = "My dog has fleas";
		// use the length method
		// of the string object. The method returns the length
		// in characters, of the contents of the String object.
		// Now display the length of the String.

		wordcount = MyVar.length();
		System.out.println("Length of the String: " + wordcount);
	}

}
