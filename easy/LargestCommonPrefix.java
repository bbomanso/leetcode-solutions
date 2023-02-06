import java.util.Arrays;

public class LargestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"}; // output: fl
        System.out.println("intput: strs = " + Arrays.toString(strs));

        String output = longestCommonPrefix(strs);
        System.out.println("output: " + output);
    }

    private static String longestCommonPrefix(String[] strs) {
        // if array has length of 0 then just return empty string
        if(strs.length == 0){
            return "";
        }

        // taking the first string in the array 
        String prefix = strs[0];

        // for loop for iterating through the elements in the array
        // starting from index 1 we get the next String to be compared
        for(int i = 1 ; i < strs.length ; i++){
            String str = strs[i];

            // if prefix is not part of str then we adjust prefix string
            while(str.indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                // flowe -> flow
                // flow -> flow
            }
        }

        return prefix;
    }
}
