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
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<>();
    if (root == null)
      return res;
    Queue<TreeNode> que = new LinkedList<>();
    que.offer(root);
    while (!que.isEmpty()) {
      int num = que.size();
      List<Integer> temp = new ArrayList<>();
      for (int i = 0; i < num; i++) {
        TreeNode node = que.poll();
        temp.add(node.val);
        if (node.left != null)
          que.offer(node.left);
        if (node.right != null)
          que.offer(node.right);
      }
      res.add(temp);
    }
    return res;
  }
}