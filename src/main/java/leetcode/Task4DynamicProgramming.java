package leetcode;

public class Task4DynamicProgramming {
    public static void main(String[] args) {
        Task4DynamicProgramming task4DynamicProgramming = new Task4DynamicProgramming();
/*        System.out.println(task4DynamicProgramming.rob(new int[]{
                183, 219, 57,
                193, 94, 233,
                202, 154, 65,
                240, 97, 234,
                100, 249, 186,
                66, 90, 238,
                168, 128, 177,
                235, 50, 81,
                185, 165, 217,
                207, 88, 80,
                112, 78, 135,
                62, 228, 247,
                211})); */
//System.out.println(task4DynamicProgramming.rob(new int[]{
//                228,67,195,15,0,90,151,210,17,196,0,10,28,110,169,94,9,23,52,63,136,122,22,191,144,22,173,106,88,59,200,156,39,109,244,231,183,99,114,15,114,32,57,36,117,151,177,106,229,188,178,47,96,191,25,180,153,187,136,146,117,57,77,110,215,115,84,218,59,121,202,109,205,95,214,100,175,50,223,11,14,164,224,15,100,241,61,64,197,206,3,149,108,186}));
        System.out.println(task4DynamicProgramming.rob(new int[]{1, 2, 1, 2}));
    }

    public int rob(int[] nums) {

        return Math.max(checkNext(nums, 0), checkNext(nums, 1));
    }

    public int checkNext(int[] nums, int i) {
        int maxSum = nums.length == 0 ? 0 : nums.length == 1 ? nums[0] : nums[i];
        int tempSum = 0;
        int altSum = 0;
        while (i + 2 < nums.length) {

            if (nums.length > i + 3) {
                //c>d
                if (nums[i + 2] >= nums[i + 3]) {
                    maxSum += nums[i + 2];
                    i += 2;
                }
                //d>c
                else if (nums[i + 3] > nums[i + 2]) {
                    do {
                        //c
                        tempSum += nums[i + 2];
                        //d
                        if (nums.length > i + 3) {
                            altSum += nums[i + 3];
                        }
                        i += 2;
                        if (tempSum > altSum) break;
                    } while (nums.length > i + 2 && tempSum + nums[i + 2] > altSum);
                    maxSum += Math.max(altSum, tempSum);
                    if (altSum > tempSum) i++;
                    altSum = tempSum = 0;
                }
            } else if (nums.length > i + 2) {
                maxSum += nums[i + 2];
                i += 2;
            }
        }
        return maxSum;
    }
}
