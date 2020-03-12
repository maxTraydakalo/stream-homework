package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Task12Medium {
    public static void main(String[] args) {
        System.out.println(intToRoman(20));
    }

    public static String intToRoman(int num) {
        HashMap<Integer, String> romanianToArabic = new HashMap<Integer, String>() {{
            put(1, "I");
            put(4, "IV");
            put(5, "V");
            put(9, "IX");
            put(10, "X");
            put(40, "XL");
            put(50, "L");
            put(90, "XC");
            put(100, "C");
            put(400, "CD");
            put(500, "D");
            put(900, "CM");
            put(1000, "M");
        }};
        List<Integer> arabNumbers = Arrays.asList(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
        StringBuilder temp = new StringBuilder();
        while (num > 0) {
            for (int arabNumber : arabNumbers) {
                if (num >= arabNumber) {
                    temp.append(romanianToArabic.get(arabNumber));
                    num = num - arabNumber;
                    break;
                }
            }
        }
        return temp.toString();
    }
}
