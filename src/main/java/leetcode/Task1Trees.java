package leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task1Trees {
    public static void main(String[] args) {
        TreeNode treeNodeRoot = new TreeNode(2);
        treeNodeRoot.left = new TreeNode(1);
        treeNodeRoot.right = new TreeNode(4);
        treeNodeRoot.right.left = new TreeNode(3);
        treeNodeRoot.right.right = new TreeNode(5);

        System.out.println(Solution.maxDepth(treeNodeRoot));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    static class Solution {
        public static void sout(TreeNode root, int depth, Set<Integer> a) {
            //System.out.println(root.val);
            a.add(depth);
            if (root.left != null) sout(root.left, depth + 1, a);
            if (root.right != null) sout(root.right, depth + 1, a);
        }

        public static int maxDepth(TreeNode root) {
//            if(root == null) return 0;
//            return Math.max(maxDepth(root.left) + 1,
//                    maxDepth(root.right) + 1);
            Set<Integer> depths = new TreeSet<>();
            if (root==null) return 0;
            sout(root, 1, depths);
            return depths.stream().max(Integer::compareTo).orElseGet(() -> 0);
        }
    }


}

