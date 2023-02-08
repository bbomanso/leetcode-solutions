public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println("input: s = \"" + s + "\", t = \"" + t + "\"");

        boolean output = isSubsequence(s,t);
        System.out.println("output: " + output);
    }

    private static boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) {
            return true;
        }

        int sIdx = 0;
        int tIdx = 0;
        int count = 0;

        while(tIdx < t.length()) {
            // if characters are equal then move to the next index to compare it
            if(s.charAt(sIdx) == t.charAt(tIdx)) {
                count++;
                // if count matches the size of string s then it is true
                if(count == s.length()) {
                    return true;
                }

                sIdx++;
                tIdx++;
            }
            // if they don't match, incremeent index of t String
            else {
                tIdx++;
            }
        }
        return false;
    }
}
