import java.util.*;

public class RemoveElementsARR1 {
	  // Method to remove all elements from an array
    public static void removeAllElements(int[] array) {
        Arrays.fill(array, 0); // Set all elements to 0
    }
	public static void main(String[] args) {
		// Define an array with some elements
        int[] array = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Remove all elements from the array
        removeAllElements(array);

        // Print the array after removing all elements
        System.out.println("Array after removing all elements: " + Arrays.toString(array));  
	}
}
