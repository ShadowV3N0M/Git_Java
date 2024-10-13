import java.util.*;
public class AddArray {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				int ar[]=new int[5];
				for(int i=0;i< ar.length;i++)
				 {
					 System.out.print("Enter a["+i+"]:");
					 ar[i]=sc.nextInt();
				 }
				int add = 0;
				for(int i=0;i<ar.length;i++)
				{
					add= add + ar[i];
				}
			
				System.out.println("Total Sum of array:"+add);	
		}
	}

