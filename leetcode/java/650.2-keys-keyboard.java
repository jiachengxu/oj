class Solution {
  public int minSteps(int n) {
    int[] dp = new int[n + 1];
    for (int i = 2; i < n + 1; i++) {
      for (int j = i - 1; j > 0; j--) {
        if (i % j == 0) {
          dp[i] = dp[j] + (i / j);
          break;
        }
      }
    }
    return dp[n];
  }
}