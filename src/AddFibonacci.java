import java.util.*;
public class AddFibonacci {
	 // Method to calculate the sum of the first n Fibonacci numbers
    public static int sumOfFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }

        int a = 0, b = 1, sum = a + b;

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            sum += next;
            a = b;
            b = next;
        }

        return sum;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();

        // Calculate the sum of the first n Fibonacci numbers
        int sum = sumOfFibonacci(n);

        // Display the result
        System.out.println("\nThe sum of the first " + n + " Fibonacci numbers is: " + sum);
	}
}
