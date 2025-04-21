package SlidingWindow;

import java.util.HashMap;

public class LC340_LengthOfLongestSubstringKDistinct {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int i = 0, j = 0, res = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (j < s.length()) {
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            while (map.size() > k) {
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if (map.get(s.charAt(i)) == 0) {
                    map.remove(s.charAt(i));
                }
                i++;
            }

            res = Math.max(res, j - i + 1);
            j++;
        }

        return res;
    }

    public static void main(String[] args) {
        LC340_LengthOfLongestSubstringKDistinct solver = new LC340_LengthOfLongestSubstringKDistinct();
        String s = "eceba";
        int k = 2;
        int result = solver.lengthOfLongestSubstringKDistinct(s, k);
        System.out.println("Longest substring with at most " + k + " distinct characters: " + result);  // Output: 3
    }
}
