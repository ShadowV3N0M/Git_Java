import java.util.*;

public class ArraySum {

	    // Method to compute the sum of array elements
	    public static int sumArray(int[] array) {
	        int sum = 0;
	        for (int element : array) {
	            sum += element;
	        }
	        return sum;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Compute the sum of array elements
        int sum = sumArray(array);

        // Display the sum
        System.out.println("The sum of the array elements is: " + sum);
	}
}
