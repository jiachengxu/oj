class Solution {
  public char nextGreatestLetter(char[] letters, char target) {
    if (letters[0] > target || letters[letters.length - 1] <= target)
      return letters[0];
    int l = 0, r = letters.length - 1;
    while (l < r) {
      int mid = l + (r - l) / 2;
      if (letters[mid] <= target)
        l = mid + 1;
      else
        r = mid;
    }
    return letters[l];
  }
}