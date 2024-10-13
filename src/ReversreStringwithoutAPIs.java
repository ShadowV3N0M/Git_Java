
public class ReversreStringwithoutAPIs {

	public static void main(String[] args) {
		String s = "Coder Technologies vashi";
		
		System.out.println("Original String: "+s);
        char[] charArray = s.toCharArray();
        
        // Step 1: Reverse the entire string
        reverse(charArray, 0, charArray.length - 1);
        
        // Step 2: Reverse each word in the reversed string
        int start = 0;
        for (int i = 0; i <= charArray.length; i++) {
            if (i == charArray.length || charArray[i] == ' ') {
                reverse(charArray, start, i - 1);
                start = i + 1;
            }
        }
        
        // Convert char array back to string and print
        String reversedString = new String(charArray);
        System.out.println("\nReversed String: " + reversedString);
    }

    // Helper method to reverse a portion of the char array
    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
	}
}
