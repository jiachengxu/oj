class Solution {
  public void moveZeroes(int[] nums) {
    if (nums == null || nums.length == 0)
      return;
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0)
        continue;
      nums[j] = nums[i];
      j++;
    }
    for (int i = j; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}