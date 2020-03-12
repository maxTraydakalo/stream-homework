package leetcode;

import java.util.Arrays;

public class Task27 {
    public static int removeElement(int[] nums, int val) {
        int counter =0;
        for (int i = 0; i <nums.length-counter; i++) {
            if (val==nums[i]){

                counter++;
                System.arraycopy(nums, i+1,nums,i, nums.length-i-1);
                i--;
            }
        }
        return nums.length-counter;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}
