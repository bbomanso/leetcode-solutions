import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println("input: nums = " + Arrays.toString(nums));

        boolean output = containsDuplicate(nums);
        System.out.println("output: " + output);
    }

    private static boolean containsDuplicate(int[] nums) {

        Set<Integer> list = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            // if current element is not present in the list, add element to the list
            if(!(list.contains(nums[i]))) {
                list.add(nums[i]);
            }
            // if current element contains in the list, that means that we have a duplicated element
            else {
                return true;
            }
        }

        return false;
    }
}
