import java.util.Scanner;
import java.util.*;

public class lab5Pali {

	
	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		
		
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter a palindrome to test.");
		String origonal = console.next();
		
		
		int ln = origonal.length();
		String reverse = "";
		
		//isaPalindrome(reverse, origonal,ln);
		
		if(isaPalindrome(reverse, origonal,ln))
		{
			System.out.println("It's a palindrome!");
		}
		else
		{
			System.out.println("That's not a palindrome.");
		}
	}
	
	
	
	
	public static boolean isaPalindrome(String rev, String ori, int ln)
	{

		
		boolean test;
		 
	      for ( int i = ln - 1 ; i >= 0 ; i-- )
	         rev = rev + ori.charAt(i);

	      
	      
		if(ori.equals(rev))
		{
			test = true;
		}
		else
		{
			test = false;
		}
		
	return test;
	}

}


