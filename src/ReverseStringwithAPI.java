import java.util.*;
public class ReverseStringwithAPI {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		System.out.print("\nEnter the Sentence: ");
		 String s = sc.nextLine();
//        String s = "Coder Technologies Vashi";
        
        // Split the string into words
        String[] words = s.split(" ");
        
        // Reverse the order of words
        StringBuilder reversedString = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
        }   
        // Print the reversed string
        String s1 = reversedString.toString();
        System.out.println("\nReversed Sentence: " + s1);
	}
}
