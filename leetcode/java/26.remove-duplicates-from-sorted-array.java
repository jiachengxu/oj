class Solution {
  // Time O(n)
  // Space O(1)
  public int removeDuplicates(int[] nums) {
    if (nums == null || nums.length == 0)
      return 0;
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == nums[j])
        continue;
      nums[j + 1] = nums[i];
      j++;
    }
    return j + 1;
  }
}