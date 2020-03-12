package leetcode;

public class Task415 {
    public static void main(String[] args) {
        System.out.println(addStrings("123456789", "987654321"));
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int tempNum1;
        int tempNum2;
        int tempSum;
        int plusOne = 0;
        for (int i = 1; i <= (Math.max(num1.length(), num2.length())); i++) {
            tempNum1 = num1.length() >= i ? num1.charAt(num1.length() - i) : 48;
            tempNum2 = num2.length() >= i ? num2.charAt(num2.length() - i) : 48;
            tempSum = (plusOne + tempNum1 + tempNum2 - 96) > 9
                    ? plusOne + tempNum1 + tempNum2 - 106
                    : plusOne + tempNum1 + tempNum2 - 96;
            plusOne = (plusOne + tempNum1 + tempNum2 - 96) > 9 ? 1 : 0;
            result.insert(0, tempSum);
        }
        return plusOne == 1 ? result.insert(0, 1).toString() : result.toString();
    }
}
