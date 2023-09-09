import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    public void SolutionTest() {
        Solution solution = new Solution();

        TreeNode tree1 = new TreeNode(4);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(2);
        assertTrue(solution.checkTree(tree1));

        TreeNode tree2 = new TreeNode(5);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);
        assertTrue(solution.checkTree(tree2));

        TreeNode tree3 = new TreeNode(-2);
        tree3.left = new TreeNode(-1);
        tree3.right = new TreeNode(-1);
        assertTrue(solution.checkTree(tree3));

        TreeNode tree4 = new TreeNode(3);
        tree4.left = new TreeNode(-2);
        tree4.right = new TreeNode(2);
        assertFalse(solution.checkTree(tree4));

        TreeNode tree5 = new TreeNode(100);
        tree5.left = new TreeNode(99);
        tree5.right = new TreeNode(1);
        assertTrue(solution.checkTree(tree5));


        System.out.println("All test cases passed.");
    }
}
