import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19; // output: true
        System.out.println("input: n = " + n);

        boolean output = isHappy(n);
        System.out.println("output: "+output);
    }

    private static boolean isHappy(int n) {
        int remainder = 0;
        int sum = 0;

        Set<Integer> set = new HashSet<>(); // using HashSet to store unique values

        while(!set.contains(n)) {

            // if n becomes 1 return true
            if(n == 1) {
                return true;
            }

            set.add(n);

            // loop to calculate the sum of squares of n
            while(n != 0) {
                remainder = n % 10;
                sum = sum + (remainder * remainder);
                n = n / 10;
            }

            n = sum;
            sum = 0;
        }

        // return false if n is not equal to 1
        return false;
    }
}