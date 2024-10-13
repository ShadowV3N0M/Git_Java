import java.util.*;
public class RemoveElementARR {
	 // Method to remove all occurrences of an element from the array
    public static int[] removeAllOccurrences(int[] array, int element) {
        // Calculate the new array size by counting elements not equal to the specified element
        int count = 0;
        for (int value : array) {
            if (value != element) {
                count++;
            }
        }
        // Create a new array to hold the elements that are not equal to the specified element
        int[] newArray = new int[count];
        int index = 0;
        for (int value : array) {
            if (value != element) {
                newArray[index++] = value;
            }
        }
        return newArray;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the size of the array: ");	 // Input the size of the array
        int size = sc.nextInt();

        // Input the elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Input the element to be removed
        System.out.print("Enter the element to be removed: ");
        int element = sc.nextInt();

        // Remove all occurrences of the specified element
        int[] newArray = removeAllOccurrences(array, element);

        // Display the new array
        System.out.println("Array after removing all occurrences of " + element + ": " + Arrays.toString(newArray));
	}
}
