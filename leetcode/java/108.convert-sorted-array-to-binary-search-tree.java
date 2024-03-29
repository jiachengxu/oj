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
  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums == null || nums.length == 0)
      return null;
    return helper(nums, 0, nums.length - 1);
  }

  TreeNode helper(int[] nums, int low, int high) {
    while (low > high) return null;
    int mid = low + (high - low) / 2;
    TreeNode node = new TreeNode(nums[mid]);
    node.left = helper(nums, low, mid - 1);
    node.right = helper(nums, mid + 1, high);
    return node;
  }
}