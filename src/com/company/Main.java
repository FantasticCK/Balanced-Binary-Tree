package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        return helper(root)[0] == 1;
    }

    // res[0]: if balanced tree, res[1]: height
    private int[] helper(TreeNode root) {
        if (root == null) {
            return new int[]{1, 0};
        }
        int[] left = helper(root.left), right = helper(root.right);
        int ifBalanced = left[0] == 0 || right[0] == 0 || Math.abs(left[1] - right[1]) > 1 ? 0 : 1;
        int height = Math.max(left[1], right[1]) + 1;
        return new int[] {ifBalanced, height};
    }
}