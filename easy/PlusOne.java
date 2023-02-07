import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        //int[] digits = {4,3,0,9}; // output: [4,3,1,0]
        int[] digits = {9,9,9,9}; // output: [1,0,0,0,0]
        System.out.println("input: digits = " + Arrays.toString(digits));

        int[] output = plusOne(digits);
        System.out.println("output: " + Arrays.toString(output));
    }

    private static int[] plusOne(int[] digits) {
        // starting from right to left
        for(int i = digits.length-1; i >= 0; i--) {
            // if digit is less or equal than 8, increment the current digit
            // Example: if digit is 6, we increment to 7 and return the updated digit array
            if(digits[i] <= 8) {
                digits[i]++;
                return digits;
            }
            // if digit is greater than 8, we set it to 0.
            // Example: if digit is 9 we set it to zero since 9 + 1 = 10
            else {
                digits[i] = 0;
            }
        }

        // if it comes out of the for loop that means that the first digit in the array is 0
        // so we have to create a new array with a bigger length
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;

        return arr;
    }
}
