package leetcode;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abacd"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int startChar = 0;
        int maxlength = 0;
        String tempSubstring;
        for (int i = 1; i <= s.length(); i++) {
            tempSubstring = s.substring(startChar, i);
            maxlength = Math.max(maxlength, i - startChar);
            if (s.length() >= i + 1 && tempSubstring.contains(s.substring(i, i + 1))) {
                startChar = i;
            }
        }
        return maxlength;
    }
}
