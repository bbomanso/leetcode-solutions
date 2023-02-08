import java.util.Arrays;

/**
 * Number: 169
 * Name: Majority Element
 * Difficulty: Easy
 */

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println("input: nums = " + Arrays.toString(nums));

        int output = majorityElement(nums);
        System.out.println("output: " + output);
    }

    private static int majorityElement(int[] nums) {
        // initialize count and majority to the first element in the array
        int count = 1;
        int majority = nums[0];

        for(int i = 0; i < nums.length; i++) {
            // if current element is equal to the majority element, increase the count
            if(majority == nums[i]) {
                count++;
            }
            // if the current element is not equal to the majority, decremeent count
            else {
                count--;
            }
            // if the count reaches 0, update the majority to the current element
            if(count == 0) {
                majority = nums[i];
                count = 1;
            }
        }

        return majority; // return the majority element
    }
}
