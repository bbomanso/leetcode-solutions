/**
 * #33. Search in Rotated Sorted Array
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 * Code Status: Accepted
 * Runtime: 0ms (beats 100%)
 * Memory: 41.6 MB (beats 95.3%)
 * 
*/

package medium;

import java.util.Arrays;

public class SearchInRotatedSortedWay {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("input: nums = " + Arrays.toString(nums));

        int targetIndex = search(nums, target);
        System.out.println("output: index = " + targetIndex);
    }

    private static int search(int[] nums, int target) {
        // if sorted array is rotated then the rightmost element will not be biggest element in the array
        int left = 0;
        int right = nums.length - 1;

        // find the pivot where the array is rotated
        while(left < right) {
            int mid = (left + right) / 2;

            // if element at the mid index is greater than the element at the right,
            // then we can say that the array is rotated after the middle index
            if(nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // else, the pivot is in the left part
            else {
                right = mid;
            }
        }

        // left index will point to the pivot
        int pivot = left;
        left = 0;
        right = nums.length -1;

        // find which half od the array, the target is present
        if(target >= nums[pivot] && target <= nums[right]) {
            left = pivot;
        }
        else {
            right = pivot;
        }

        // normal binary search
        while(left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            else if(target < nums[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
