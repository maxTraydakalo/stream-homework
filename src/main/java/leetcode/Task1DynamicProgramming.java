package leetcode;

import java.util.stream.Stream;

public class Task1DynamicProgramming {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(6));
    }

    static class Solution {
        public int climbStairs(int n) {
            return Stream.iterate(new int[]{0, 1}, x -> new int[]{x[1], x[0] + x[1]})
                    .skip(n).findFirst().get()[1];
        }

    }
}
