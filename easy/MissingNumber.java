import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3,0,1}; // output: 2
        System.out.println("input: nums = " + Arrays.toString(nums));

        int output = missingNumber(nums);
        System.out.println("output: " + output);
    }

    private static int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        // add all elements present in the array to the HashSet
        for(int num : nums) {
            set.add(num);
        }

        // checks if current number is present in the HashSet
        for(int i = 0; i <= nums.length; i++) {
            // if the number is not present, then we know it is the missing number
            if(!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
