import java.util.*;
public class MultiplicationTable {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Input for the number whose multiplication table is to be calculated
	        System.out.print("Input the number (Table to be calculated): ");
	        int number = sc.nextInt();

	        // Input for the number of terms
	        System.out.print("Input number of terms: ");
	        int terms = sc.nextInt();

	        // Display the multiplication table
	        for (int i = 0; i <= terms; i++) {
	            //System.out.printf("| %d X %d | = %d%n |", number, i, number * i);
	        System.out.println("| "+number+" X "+i+"  | ="+number*i);
	        }
	}
}
