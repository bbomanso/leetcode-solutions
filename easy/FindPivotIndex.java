import java.util.Arrays;

/**
 * Number: 724
 * Name: Find Pivot Index
 * Difficulty: Easy
 */
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println("input: nums = " + Arrays.toString(nums));

        int output = pivotIndex(nums);
        System.out.println("output: " + output);
    }

    private static int pivotIndex(int[] nums) {
        // If the length of the array is 0, return -1 as there is no pivot index
        if(nums.length == 0) {
            return -1;
        }

        int rightSum = 0;
        int leftSum = 0;

        // get the sum of all elements in the array and store it in rightSum
        for(int num : nums) {
            rightSum += num;
        }

        // Loop through the array, subtracting each element from rightSum and adding it to leftSum
        for(int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];

            // If rightSum and leftSum are equal, return the current index as the pivot index
            if(rightSum == leftSum) {
                return i;
            }
            
            leftSum += nums[i];
        }

        // if we reach the end of the loop without finding a pivot index, we return -1
        return -1;
    }   
}
