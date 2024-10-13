
public class MainStarPattern {

	public static void main(String[] args) {
		int rows = 5;
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
		 System.out.println();
	        //reverse Pyramid with spaces
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
	        System.out.println();
	        
	        for (int i = 1; i <= rows; i++) {
	            // Print i stars for the ith row
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            // Move to the next line after printing each row
	            System.out.println();
	        }  
	        System.out.println();
	        
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	}
}
