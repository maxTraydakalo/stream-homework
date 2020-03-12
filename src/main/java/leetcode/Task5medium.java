package leetcode;

public class Task5medium {
    public static String longestPalindrome(String s) {
        String longestPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            longestPalindrome = getLongestPalindrome(longestPalindrome, getPalindrome(i, i, s));
            if (checkNextSymbol(s, i)) {
                longestPalindrome = getLongestPalindrome(longestPalindrome, getPalindrome(i, i + 1, s));
            }
        }
        return longestPalindrome;
    }

    private static String getLongestPalindrome(String longestPalindrome, String tempPalindrome) {
        return longestPalindrome.length() > tempPalindrome.length()
                ? longestPalindrome
                : tempPalindrome;
    }

    private static boolean checkNextSymbol(String s, int startPos) {
        return startPos + 1 < s.length() && s.charAt(startPos) == s.charAt(startPos + 1);
    }


    private static String getPalindrome(int startPos, int endPos, String s) {
        if (startPos - 1 >= 0
                && endPos + 1 < s.length()
                && s.charAt(startPos - 1) == s.charAt(endPos + 1)) {
            return getPalindrome(startPos - 1, endPos + 1, s);
        } else {
            return s.substring(startPos, endPos + 1);
        }
    }
}
