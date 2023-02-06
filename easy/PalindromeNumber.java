public class PalindromeNumber {
    public static void main(String[] args) {
        //int x = 121; // output: true
        //int x = -121; // output: false
        int x = 10; // output: false
        System.out.println("intput: x = " + x);

        boolean answer = isPalindrome(x);
        System.out.println("output: " + answer);
    }

    private static boolean isPalindrome(int x) {
        // if input number is negative, then always return false
        if (x < 0) {
            return false;
        }

        // declaring variables
        int num = x;
        int remainder;
        int reverse = 0;

        // loop to reverse the input number
        while(num != 0) {
            remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num = num / 10;
        }
        
        // if number reversed is equal to input number, then return true; else, return false;
        return reverse == x? true : false;
    }
}