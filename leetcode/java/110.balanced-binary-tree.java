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
  public boolean isBalanced(TreeNode root) {
    return height(root) != -1;
  }
  public int height(TreeNode root) {
    if (root == null)
      return 0;
    int lh = height(root.left);
    if (lh == -1)
      return -1;
    int rh = height(root.right);
    if (rh == -1)
      return -1;
    if (Math.abs(lh - rh) > 1)
      return -1;
    return 1 + Math.max(lh, rh);
  }
}