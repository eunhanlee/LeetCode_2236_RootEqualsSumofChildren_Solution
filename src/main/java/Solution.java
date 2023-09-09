public class Solution {
    /**
     * Checks if a given TreeNode satisfies the condition that the value of the root node
     * is equal to the sum of values in its left and right subtrees.
     *
     * @param root The root of the TreeNode to check.
     * @return true if the condition is satisfied, false otherwise.
     */
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }

}