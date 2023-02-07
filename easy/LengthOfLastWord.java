import java.util.Arrays;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";
        System.out.println("input: " + str);

        int output = lengthOfLastWord(str);
        System.out.println("output: " + output);
    }

    private static int lengthOfLastWord(String str) {

        str = str.trim(); // cleaning up the leading and trailing spaces
        int length = 0;

        // starting from right to left
        for(int i = str.length()-1; i >= 0; i--) {
            // if current element is a white space, then we break out of the loop
            if(str.charAt(i) == ' ') {
                break;
            }
            length++; // element being a character, length will be incremented
        }

        return length; // return the length of the last element in the string
    }
}
