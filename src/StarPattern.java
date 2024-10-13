
public class StarPattern {

	public static void main(String[] args) {
		int rows = 5; // You can change this value to increase or decrease the number of rows
	      
		 for (int i = 1; i <= rows; i++) {
	            // Print spaces
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 1; k <= (2 * i) - 1; k++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
		for (int i = rows; i >= 1; i--) {
           // Print leading spaces
           for (int j = 1; j <= rows - i; j++) {
               System.out.print(" ");
           }
           // Print stars
           for (int k = 1; k <=(2* i)-1; k++) {
               System.out.print("*");
           }
           System.out.println();
       }
		
       for (int i = 1; i <= rows; i++) {
           // Print leading spaces
           for (int j = 1; j <= rows - i; j++) {
               System.out.print(" ");
           }
           // Print stars
           for (int k = 1; k <= (2 * i) - 1; k++) {
               System.out.print("*");
           }
           System.out.println();
       }
       // Print lower half of the pyramid
       for (int i = rows - 1; i >= 1; i--) {
           // Print leading spaces
           for (int j = 1; j <= rows - i; j++) {
               System.out.print(" ");
           }
           // Print stars
           for (int k = 1; k <= (2 * i) - 1; k++) {
               System.out.print("*");
           }
           System.out.println();
       }
       for (int i = 1; i <= rows; i++) {
           // Print leading spaces
           for (int j = i; j < rows; j++) {
               System.out.print(" ");
           }
           // Print stars with space in between
           for (int k = 1; k <= (2 * i - 1); k++) {
               if (k % 2 == 0) {
                   System.out.print(" ");
               } else {
                   System.out.print("*");
               }
           }
           // Move to the next line
           System.out.println();
       }
       
       for (int i = rows; i >= 1; i--) {
           // Print leading spaces
           for (int j = i; j < rows; j++) {
               System.out.print(" ");
           }
           // Print stars with space in between
           for (int k = 1; k <= (2 * i - 1); k++) {
               if (k % 2 == 0) {
                   System.out.print(" ");
               } else {
                   System.out.print("*");
               }
           }
           // Move to the next line
           System.out.println();
   }
	}

}
