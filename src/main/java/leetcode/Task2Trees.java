package leetcode;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task2Trees {
    public static void main(String[] args) {
        TreeNode treeNodeRoot = new TreeNode(2);
        treeNodeRoot.left = new TreeNode(1);
        treeNodeRoot.right = new TreeNode(4);
        treeNodeRoot.right.left = new TreeNode(5);
        treeNodeRoot.right.right = new TreeNode(5);
        Solution solution = new Solution();
        System.out.println(solution.isValidBST(treeNodeRoot));
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
        public boolean isValidBST(TreeNode root) {
            Queue<TreeNode> tempNodes = new LinkedList<>();
            Queue<TreeNode> nextNodes = new LinkedList<>();
            int counter = 1;
            if (root != null) tempNodes.offer(root);
            while (!tempNodes.isEmpty() || !nextNodes.isEmpty()) {
                while (!tempNodes.isEmpty()) {
                    TreeNode treeNode = tempNodes.poll();
                    TreeNode pseudoRoot = root;
                    for (int i = 0; i < counter; i++) {
                        if (i == counter - 1 && pseudoRoot != treeNode) return false;
                        if (pseudoRoot==null) return false;
                        else if (pseudoRoot.val > treeNode.val) pseudoRoot = pseudoRoot.left;
                        else if (pseudoRoot.val < treeNode.val) pseudoRoot = pseudoRoot.right;
                    }
                    if (treeNode.left != null) {
                        nextNodes.offer(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        nextNodes.offer(treeNode.right);
                    }
                }
                tempNodes.addAll(nextNodes);
                nextNodes.removeAll(tempNodes);
                counter++;
            }
            return true;
//            if (root.left != null) {
//                if (root.left.val > root.val) {
//                    return false;
//                } else return isValidBST(root.left);
//            }
//            if (root.right != null) {
//                if (root.right.val < root.val) {
//                    return false;
//                } else return isValidBST(root.right);
//            }
        }
    }
}
