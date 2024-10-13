import java.util.*;

public class ComplexADD {
	// Real and imaginary parts of the complex number
    private double real;
    private double imaginary;

    // Constructor to initialize a complex number
    public ComplexADD(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexADD add(ComplexADD other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexADD(newReal, newImaginary);
    }

    // Method to display the complex number
    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

	public static void main(String[] args) {
		// Create two complex numbers
		ComplexADD num1 = new ComplexADD(2.3, 4.5);
		ComplexADD num2 = new ComplexADD(1.4, 3.2);

        // Add the two complex numbers
		ComplexADD result = num1.add(num2);

        // Display the result
        System.out.print("The sum of ");
        num1.display();
        System.out.print("and ");
        num2.display();
        System.out.print("is ");
        result.display();
	}
}
