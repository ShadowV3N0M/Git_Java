import java.util.*;
public class RemoveDupliARR {
	// Method to remove duplicate elements from an array
    public static int[] removeDuplicates(int[] array) {
        // Sort the array to bring duplicates together
        Arrays.sort(array);
        
        // Length of the new array without duplicates
        int newLength = 1;

        // Traverse the array
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                array[newLength++] = array[i];
            }
        }

        // Create a new array with the new length
        int[] result = new int[newLength];
        System.arraycopy(array, 0, result, 0, newLength);

        return result;
    }
	public static void main(String[] args) {
		// Define an array with some duplicate elements
        int[] array = {4, 2, 9, 4, 5, 2, 1, 9, 6, 3, 7, 8, 8, 6};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(array));

        // Remove duplicate elements from the array
        int[] newArray = removeDuplicates(array);

        // Print the array after removing duplicate elements
        System.out.println("Array after removing duplicates: " + Arrays.toString(newArray));   
	}
}
