import java.util.*;

public class LargNumArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No. of Elements for the array: ");
		int n=sc.nextInt();
		System.out.println();
		
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
		System.out.print("Enter Array arr["+(i+1)+"]:");
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max) 
			{
				max=arr[i];
			}
		}
		System.out.println("Highest No in Array is:"+max);
	}
}
