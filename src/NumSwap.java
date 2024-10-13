import java.util.*;
public class NumSwap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Number 1: ");
		int a=sc.nextInt();
		System.out.print("Enter Number 2: ");
		int b=sc.nextInt();
	        System.out.println("Before swap:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	        // Swapping without using a third variable
	        a = a + b; // a now becomes 15
	        b = a - b; // b now becomes 5 (15 - 10)
	        a = a - b; // a now becomes 10 (15 - 5)

	        System.out.println("After swap:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	}
}
