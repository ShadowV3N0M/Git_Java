import java.util.*;
public class TransposeMatrix {
	 // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the MatrixTranspose class
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        // Input the number of rows and columns of the matrix
	        System.out.print("Enter the number of rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int cols = sc.nextInt();

	        int[][] matrix = new int[rows][cols];

	        // Input the elements of the matrix
	        System.out.println("Enter the elements of the matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                matrix[i][j] = sc.nextInt();
	            }
	        }

	        // Display the original matrix
	        System.out.println("Original matrix:\n");
	        displayMatrix(matrix);

	        // Find and display the transpose of the matrix
	        int[][] transpose = transposeMatrix(matrix);
	        System.out.println("\nTranspose of the matrix:\n");
	        displayMatrix(transpose);
	}
}
