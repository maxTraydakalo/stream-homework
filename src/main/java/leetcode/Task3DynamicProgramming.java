package leetcode;

public class Task3DynamicProgramming {
    public static void main(String[] args) {
        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] array1 = new int[]{-2};
        int[] array2 = new int[]{-1, -2};
        System.out.println(maxSubArray(array));
        System.out.println(maxSubArray(array1));
        System.out.println(maxSubArray(array2));
    }

    public static int maxSubArray(int[] nums) {
        int temp, max;
        temp = max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (temp > 0) {
                if (temp + nums[i] > 0) {
                    temp += nums[i];
                } else {
                    temp = nums[i];
                }
            } else {
                temp = nums[i];
            }
            max = Math.max(temp, max);
        }
        return max;
    }
}
