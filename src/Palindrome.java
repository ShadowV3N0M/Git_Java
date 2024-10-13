import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("****Palindrome Check****");
		
		System.err.println("\nEnter the Word: ");
		 String s = sc.nextLine();
	        
	        // Convert the string to lower case to make the check case-insensitive
	        s = s.toLowerCase();
	        
	        // Variable to hold whether the string is a palindrome
	        boolean isPalindrome = true;
	        
	        // Check each character from the start and end moving towards the center
	        int length = s.length();
	        for (int i = 0; i < length / 2; i++) {
	            if (s.charAt(i) != s.charAt(length - i - 1)) {
	                isPalindrome = false;
	                break;
	            }
	        }
	       
	        // Print the result
	        if (isPalindrome) {
	            System.out.println("The string \"" + s + "\" is a palindrome.");
	        } else {
	            System.out.println("The string \"" + s + "\" is not a palindrome.");
	        }
	}
}
