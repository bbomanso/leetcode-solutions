import java.util.Arrays;

/**
 * Leetcode
 * Number: 35
 * Name: Search Insert Position
 * Difficulty: Easy
 */

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println("input: nums = " + Arrays.toString(nums) + ", target = " + target);

        int output = searchInsert(nums, target);
        System.out.println("output: " + output);
    }

    private static int searchInsert(int[] nums, int target) {
        // since array is sorted then use binary search
        int start = 0;
        int end = nums.length-1;

        while(start < end) {
            int mid = (start + end) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return start;
    }
}