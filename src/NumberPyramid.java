import java.util.*;
public class NumberPyramid {
	// Method to print the pyramid number pattern
    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces for alignment
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print the numbers in ascending order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print the numbers in descending order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line after printing a row
            System.out.println();
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.print("Enter the number of rows for the pyramid: ");
	        int n = sc.nextInt();
	        // Number of lines in the pattern
	     // Print the pyramid number pattern
	        printPyramid(n);
	        // Loop for each line
	        for (int i = 1; i <= n; i++) {
	            // Loop for each number in the line
	            for (int j = 1; j <= i; j++) {
	            	//for(int k=1;k % 2==0;k++) {
	                // Print 1 if it's the first number or if i and j are equal, otherwise print 0
	                if (j == 1 || i == j) {
	                    System.out.print("1 ");
	                } else {
	                    System.out.print("0 ");
	                }
	            }
	           // }
	            // Move to the next line
	            System.out.println();
	        }
	        System.out.println();
	        
	        int rows = 4; // adjust the number of rows as needed
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print((j % 2 == 1)? "1 " : "0 ");
	            }
	            System.out.println();
	        }
	       System.out.println();
	        int[][] matrix = {
	                {1},
	                {0, 1},
	                {1, 0, 1},
	                {0, 1, 0, 1}
	            };

	            // Print the matrix
	            for (int i = 0; i < matrix.length; i++) {
	                for (int j = 0; j < matrix[i].length; j++) {
	                    System.out.print(matrix[i][j] + " ");
	                }
	                System.out.println();
	            }  
	            System.out.println();
	            for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= i; j++) {
		            	 if((i+j)%2==0 ) {
			                    System.out.print("1 ");
			                }else{
			                	System.out.print("0 ");
			                }
		            }
		            System.out.println();
		        }  
	            System.out.println();
	            //int n = 4;  // Number of rows

	            for (int i = 1; i <= n; i++) {
	                for (int j = 1; j <= i; j++) {
	                    // Print 1 if the sum of the row and column index is odd, otherwise print 0
	                    if ((i + j) % 2 == 0) {
	                        System.out.print("1 ");
	                    } else {
	                        System.out.print("0 ");
	                    }
	                }
	                System.out.println();
	            }    
	}

}
