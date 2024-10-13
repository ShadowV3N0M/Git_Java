import java.util.*;
public class MainFactorial {

	public static void main(String[] args) {
		Scanner fa=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int num=fa.nextInt();
		if(num<0)
		{
			System.out.println("Invaild Number Factorial cannot be Negative.");
		}else
		{
		long fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("Factorial of "+num+" is:"+fact);	
	}	
	}
}
