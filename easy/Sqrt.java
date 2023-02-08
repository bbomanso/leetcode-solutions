public class Sqrt {
    public static void main(String[] args) {
        int x = 8; // output: 2
        System.out.println("input: x = " + x);

        int output = mySqrt(x);
        System.out.println("output: " + output);
    }

    private static int mySqrt(int x) {
        // if x is 0, return 0
        if(x == 0) {
            return 0;
        }

        // setting the start and end boundaries
        int start = 1;
        int end = x;

        // using binary search to find the square root
        while(start <= end) {
            // calculating mid value
            int mid = (start + end) / 2;

            // if mid is the square root, return mid
            if(x / mid == mid) {
                return mid;
            }
            // if mid is bigger than x, move end pointer to the left
            else if(mid > x / mid) {
                end = mid - 1;
            }
            // if mid is smaller than x, move start pointer to the right
            else {
                start = mid + 1;
            }
        }
        return end;
    }
}
