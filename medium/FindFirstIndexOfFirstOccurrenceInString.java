package medium;

public class FindFirstIndexOfFirstOccurrenceInString {
    public static void main(String[] args) {
        String haystack = "sadbutsad"; // output: 0
        String needle = "sad";
        System.out.println("input: haystack = " + haystack + ", needle = " + needle);

        int index = strStr(haystack, needle);
        System.out.println("output: " + index);
    }

    private static int strStr(String haystack, String needle) {
        // check if needle sequence of characters is contained in the haystack string
        if(haystack.contains(needle)) {
            // returning the index of the first occurrence of needle in haystack
            return haystack.indexOf(needle);
        }
        // returning -1 if needle is not part of haystack
        return -1;
    }
}