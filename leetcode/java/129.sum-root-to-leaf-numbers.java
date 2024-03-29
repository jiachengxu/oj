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
  public int sumNumbers(TreeNode root) {
    ;
    return sum(root, 0);
  }
  int sum(TreeNode root, int s) {
    if (root == null)
      return 0;
    if (root.right == null && root.left == null)
      return s * 10 + root.val;
    return sum(root.left, s * 10 + root.val) + sum(root.right, s * 10 + root.val);
  }
}