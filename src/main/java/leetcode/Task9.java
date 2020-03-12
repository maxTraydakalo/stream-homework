package leetcode;

import java.util.Arrays;

public class Task9 {
    public static boolean isPalindrome(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            if (chars[i]!=chars[chars.length-i-1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
