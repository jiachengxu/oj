class Solution {
  public List<Integer> findDuplicates(int[] nums) {
    List<Integer> res = new ArrayList<>();
    if (nums == null || nums.length == 0)
      return res;
    int len = nums.length;
    for (int i = 0; i < len; i++) {
      int index = Math.abs(nums[i]) - 1;
      if (nums[index] < 0) {
        res.add(index + 1);
      }
      nums[index] = -nums[index];
    }
    return res;
  }
}