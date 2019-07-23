package ca.jrvs.challenge;

/**
 * Implement a binary search tree
 */
public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int val) {
        root = insertHelper(root, val);
    }

    /**
     * A recursive function to insert a new node into BST
     */
    public TreeNode insertHelper(TreeNode root, int val) {

        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (val < root.key)
            root.left = insertHelper(root.left, val);
        else if (val > root.key)
            root.right = insertHelper(root.right, val);

        /* return the (unchanged) node pointer */
        return root;
    }
}
