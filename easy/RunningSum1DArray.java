import java.util.Arrays;

/**
 * Leetcode
 * Number: 1480
 * Name: Running Sum of 1d Array
 * Difficulty: Easy
 */
public class RunningSum1DArray {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1}; // output: [3,4,6,16,17]
        System.out.println("input: nums = " + Arrays.toString(nums));

        int[] output = runningSum(nums);
        System.out.println("output: " + Arrays.toString(output));
    }

    // this method calculates the running sum of the given array
    private static int[] runningSum(int[] nums) {
        // initializing variable that will be responsible for storing the cumulative sum
        int sum = 0;

        // looping through each element in the array
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i]; // add the current element to the cumulative sum
            nums[i] = sum; // replace the current element with the cumulative sum
        }

        return nums; // return the modified array
    }
}
