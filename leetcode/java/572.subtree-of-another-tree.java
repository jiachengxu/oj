/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public boolean isSubtree(TreeNode s, TreeNode t) {
    return traverse(s, t);
  }

  boolean equals(TreeNode s, TreeNode t) {
    if (s == null && t == null) {
      return true;
    }
    if (s == null || t == null) {
      return false;
    }
    return s.val == t.val && equals(s.left, t.left) && equals(s.right, t.right);
  }
  boolean traverse(TreeNode s, TreeNode t) {
    return s != null && (equals(s, t) || traverse(s.right, t) || traverse(s.left, t));
  }
}