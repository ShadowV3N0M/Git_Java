import java.util.*;
class Add extends AddNumbers{
	public  int add(int a,int b) {
		int sum=a+b;
		System.out.println("Sum of two Number Arguments:"+sum);

		return sum;
	}
}
public class AddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Add a1=new Add();
		a1.add(19, 21);
		
		System.out.print("Enter Number 1: ");
		int num1=sc.nextInt();
		System.out.print("Enter Number 2: ");
		int num2=sc.nextInt();
		
		int c=num1+num2;
		System.out.println("Sum of two Numbers is: "+c);
		
	}
}
