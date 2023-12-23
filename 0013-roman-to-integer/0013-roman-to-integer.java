class Solution {
  public int romanToInt(String s) {
    int ans = 0;
    
    // Map each Roman numeral character to its corresponding integer value
    int[] roman = new int[128];
    roman['I'] = 1;
    roman['V'] = 5;
    roman['X'] = 10;
    roman['L'] = 50;
    roman['C'] = 100;
    roman['D'] = 500;
    roman['M'] = 1000;

    for (int i = 0; i + 1 < s.length(); ++i) {
      // Check if the current numeral is smaller than the next numeral
      if (roman[s.charAt(i)] < roman[s.charAt(i + 1)])
        ans -= roman[s.charAt(i)];
      else
        ans += roman[s.charAt(i)];
    }

    // Add the value of the last numeral to the result
    return ans + roman[s.charAt(s.length() - 1)];
  }
}