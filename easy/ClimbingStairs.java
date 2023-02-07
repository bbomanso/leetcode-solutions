public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5; // output: 8
        System.out.println("input: n = " + n);

        int output = climbStairs(n);
        System.out.println("output: " + output);
    }

    private static int climbStairs(int n) {
        // i = 0 -> 0
        // i = 1 -> 1
        // i = 2 -> 2
        // i = 3 -> 3 ---> 2 + 1 = 3
        // i = 4 -> 5 ---> 3 + 2 = 5
        // i = 5 -> 8 ---> 5 + 3 = 8
        // i = 6 -> 13 ---> 8 + 5 = 13

        int[] arr = new int[n];

        if(n <= 2) {
            return n;
        }
        else {
            arr[0] = 1;
            arr[1] = 2;

            for(int i = 2; i < n; i++) {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }

        return arr[n-1];
    }
}
