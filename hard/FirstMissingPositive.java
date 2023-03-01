package hard;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1}; // output: 2

        int output = firstMissingPositive(nums);
        System.out.println(output);
    }

    private static int firstMissingPositive(int[] nums) {

        if (nums.length == 0) {
            return 1;
        }
        
        // move all negativee integers to the beginning of the array
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] <= 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++; // this will be the index where it indicates the first positive present in the array
            }
        }

        for(int j = i; j < nums.length; j++) {
            long index = Math.abs((long) nums[j]) - 1 + i;

            // If the index is within the bounds of the array and the integer is positive,
            // mark its presence by negating the value at the corresponding index
            if(index < nums.length && nums[(int) index] > 0) {
                nums[(int) index] = -nums[(int) index];
            }
        }

        System.out.println(Arrays.toString(nums));

        // Finding the first non-negative integer in the array
        for (int j = i; j < nums.length; j++) {
            if (nums[j] > 0) {
                return j - i + 1;
            }
        }
        
        return nums.length - i + 1;
    }
}
