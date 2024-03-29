class Solution {
  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> res = new ArrayList<>();
    if (s == null || s.length() == 0 || p == null || p.length() == 0)
      return res;
    int[] hash = new int[26];
    for (char c : p.toCharArray()) {
      hash[c - 'a']++;
    }
    int left = 0;
    int right = 0;
    int count = p.length();
    while (right < s.length()) {
      if (hash[s.charAt(right) - 'a'] >= 1) {
        count--;
      }
      hash[s.charAt(right) - 'a']--;
      right++;
      if (count == 0) {
        res.add(left);
      }
      if (right - left == p.length()) {
        if (hash[s.charAt(left) - 'a'] >= 0) {
          count++;
        }
        hash[s.charAt(left) - 'a']++;
        left++;
      }
    }
    return res;
  }
}