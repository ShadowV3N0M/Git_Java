import java.util.*;

public class IntegertoBinnary {
	   public static String integerToBinary(int number) {
	        return Integer.toBinaryString(number);
	    }
	 public static int binaryToInteger(String binaryString) {
	        return Integer.parseInt(binaryString, 2);
	    }

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Integer Number: ");
	int a=sc.nextInt();
	System.out.print("The Binary of given integer is: ");
	 String binaryString = integerToBinary(a);
     System.out.println("Binary representation: " + binaryString);
	}
}
