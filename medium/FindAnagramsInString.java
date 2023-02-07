package medium;

import java.util.ArrayList;
import java.util.List;

public class FindAnagramsInString {
    public static void main(String[] args) {
        // String s = "cbaebabacd";
        // String p = "abc";
        // String s = "abab";
        // String p = "ab";
        String s = "af";
        String p = "be";

        System.out.println("input: s = " + s + ", p = " + p);

        List<Integer> output = findAnagrams(s, p);
        System.out.println("output: " + output);
    }

    private static List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagrams = new ArrayList<>();
        int sumP = 0;
        int diff = p.length() - 1;
        int sumA = 0;

        // c b a - 99 98 97 = 294
        // a b c - 97 98 99 = 294
        // b a e - 98 97 101 = 296
        for(int i = 0; i < p.length(); i++) {
            sumP = sumP + p.charAt(i);
            System.out.println("sumP = " + sumP);
        }

        for(int i = 0; i < s.length()-diff; i++) {
            String subs = s.substring(i, i+(diff+1));
            System.out.println("subs = " + subs);

            for(int j = 0; j < subs.length(); j++) {
                sumA = sumA + subs.charAt(j);
                System.out.println("sumA = " + sumA);
            }

            if(sumA == sumP) {
                anagrams.add(i);
            }
            sumA = 0;
        }

        return anagrams;
    }
}
