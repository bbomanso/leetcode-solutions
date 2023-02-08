import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println("input: s = \"" + s + "\", t = \"" + t + "\"");

        boolean output = isIsomorphic(s,t);
        System.out.println("output: " + output);
    }

    // Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    private static boolean isIsomorphic(String s, String t) {
        // if the length of the given strings are not the same, then they cannot be isomorphic
        if(s.length() != t.length()) {
            return false;
        }

        // chars in String s will be the key, and chars in String t will be the value
        Map<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // checking if key (sChar) is already present in the map
            if(map.containsKey(sChar)) {
                // if key is present, then check if the values (tChar) are the same or not
                if (map.get(sChar) != tChar) {
                    // if values are not the same then returns false
                    return false;
                }
            }
            // if key (sChar) is not present in the map, then check if the value (tChar) has already been mapped to a key
            else {
                // if value (tChar) is already present in the map, then return false
                if (map.containsValue(tChar)) {
                    return false;
                }
                map.put(sChar, tChar); // if key and value are not present in the map, then add it to the map
            }
        }
        
        return true;
    }
}