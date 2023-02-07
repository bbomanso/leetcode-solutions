public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;

        int output = removeElement(nums, val);
        System.out.println("output: " + output);
    }

    private static int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i = 0; i < nums.length; i++) {
            // if the element in the array being iterated is not equal to the val,
            // move those elements to the beginning of the array besed on the k (index)
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
