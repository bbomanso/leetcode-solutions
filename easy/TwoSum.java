import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * #1. Two Sum
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Runtime: 1ms (beats 99.36%)
 * Memory: 43 MB (beats 26.74%)
*/

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println("input: nums = " + Arrays.toString(nums) + ", target = " + target);

        int[] indexes = twoSum(nums, target);
        System.out.println("output: indexes = " + Arrays.toString(indexes));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if(map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            else {
                map.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
