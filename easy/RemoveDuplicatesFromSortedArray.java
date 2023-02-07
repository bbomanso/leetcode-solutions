import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // sorted in ascending order
        System.out.println("input: nums = " + Arrays.toString(nums));

        int output = removeDuplicates(nums);
        System.out.println("output: " + output);
    }

    private static int removeDuplicates(int[] nums) {
        // if length of the array is zero, simply return 0
        if(nums.length == 0)
            return 0;
        
        int idx = 1; // index that unique characters will be inserted at

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] < nums[i + 1]){ // if true, num[i + 1] is a new unique number
              nums[idx] = nums[i + 1];
              idx++;
            }
        }
        return idx++;
    }
}
