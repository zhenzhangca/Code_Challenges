package ca.jrvs.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement an iterative, pre-order traversal of a given binary tree, return the list of keys of each node in the tree as it is pre-order traversed.
 *
 * Examples
 *
 *         5
 *
 *       /    \
 *
 *     3        8
 *
 *   /   \        \
 *
 * 1      4        11
 *
 * Pre-order traversal is [5, 3, 1, 4, 8, 11]
 */
public class PreOrderTraversal {
    public static List<Integer> preOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root,list);
        return list;

    }
    private static void helper(TreeNode root, List<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.key);
        helper(root.left,list);
        helper(root.right,list);
    }
}
