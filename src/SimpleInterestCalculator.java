import java.util.*;

public class SimpleInterestCalculator {
	
	// Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();

        // Input rate of interest
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();

        // Input time in years
        System.out.print("Enter the time in years: ");
        double time = sc.nextDouble();

        // Calculate simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Display the result
        System.out.printf("Simple Interest = %.2f%n", simpleInterest); 
	}
}
