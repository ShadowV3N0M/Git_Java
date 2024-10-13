import java.util.*;
public class AlphabetChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Input an alphabet: ");
	        String input = sc.nextLine();

	        // Check if input length is 1 and is an alphabet letter
	        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
	            char ch = Character.toLowerCase(input.charAt(0)); // Convert to lowercase for easier comparison
	            switch (ch) {
	                case 'a':
	                case 'e':
	                case 'i':
	                case 'o':
	                case 'u':
	                    System.out.println("Input letter is Vowel");
	                    break;
	                default:
	                    System.out.println("Input letter is Consonant");
	                    break;
	            }
	        } else {
	            System.out.println("Error: Please enter a single alphabet letter.");
	        }
	}

}
