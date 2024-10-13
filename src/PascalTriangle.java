import java.util.*;
public class PascalTriangle {
	 // Method to print Pascal's Triangle
    public static void printPascalTriangle(int n) {
        // Array to store the values of the current row
        int[] row = new int[n];

        // Loop through each row
        for (int i = 0; i < n; i++) {
            // Initialize the first element of the row
            int previous = 1;
            row[i] = previous;

            // Print leading spaces for alignment
            for (int space = 1; space < n - i; space++) {
                System.out.print(" ");
            }

            // Print each element of the row
            for (int j = 0; j <= i; j++) {
                System.out.print(previous + " ");
                
                // Calculate the next element in the row
                int temp = (previous * (i - j)) / (j + 1);
                previous = temp;
            }
            // Move to the next line after printing a row
            System.out.println();
        }
    }
    // Main method to test the Pascal's Triangle
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No of Rows: "); 
		int n = sc.nextInt(); // Number of rows
        printPascalTriangle(n);
	}
}
