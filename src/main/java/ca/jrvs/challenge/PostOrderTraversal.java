package ca.jrvs.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement an iterative, post-order traversal of a given binary tree, return the list of keys of each node in the tree as it is post-order traversed.
 * <p>
 * Examples
 * <p>
 * 5
 * <p>
 * /    \
 * <p>
 * 3        8
 * <p>
 * /   \        \
 * <p>
 * 1      4        11
 * <p>
 * Post-order traversal is [1, 4, 3, 11, 8, 5]
 */
public class PostOrderTraversal {
    public static List<Integer> postOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        helper(root, list);
        return list;
    }

    private static void helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        helper(root.left, list);
        helper(root.right, list);
        list.add(root.key);
    }
}
