/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        dfs(root, new StringBuilder(), result);
        return result;
    }

    private void dfs(TreeNode node, StringBuilder path, List<String> result) {
        int length = path.length(); // Store the original length for backtracking

        // Add the current node value to the path
        path.append(node.val);

        // If it's a leaf node, add the path to the result
        if (node.left == null && node.right == null) {
            result.add(path.toString());
        } else {
            // If not a leaf, add "->" and recurse for left and right subtrees
            path.append("->");
            if (node.left != null) dfs(node.left, path, result);
            if (node.right != null) dfs(node.right, path, result);
        }

        // Backtrack by resetting the path to its original length
        path.setLength(length);
    }
}

// TreeNode definition
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}