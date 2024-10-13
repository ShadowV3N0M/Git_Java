import java.util.*;
public class Cubeset {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Input number of terms: ");
	        int numTerms = sc.nextInt();

	        for (int i = 1; i <= numTerms; i++) {
	            int cube = i * i * i;
	            System.out.printf("Number is : %d and cube of %d is : %d %n", i, i, cube);
	        }
	}
}
