package ca.jrvs.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement an iterative, in-order traversal of a given binary tree, return the list of keys of each node in the tree as it is in-order traversed.
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
 * In-order traversal is [1, 3, 4, 5, 8, 11]
 */
public class InOrderTraversal {
    public static List<Integer> inOrder(TreeNode root) {
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
        list.add(root.key);
        helper(root.right, list);
    }
}
