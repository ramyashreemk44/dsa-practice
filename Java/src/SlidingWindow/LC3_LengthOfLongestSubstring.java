package SlidingWindow;

public class LC3_LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int res = 0, count = 0;
        int[] ca = new int[255];

        for (int i = 0; i < ca.length; i++) {
            ca[i] = -1;
        }

        int i = 0, j = 0;
        while (j < s.length()) {
            if (ca[s.charAt(j)] != -1 && ca[s.charAt(j)] >= i) {
                i = ca[s.charAt(j)] + 1;
            }

            count = j - i + 1;
            res = Math.max(res, count);
            ca[s.charAt(j)] = j;
            j++;
        }

        return res;
    }

    public static void main(String[] args) {
        LC3_LengthOfLongestSubstring solver = new LC3_LengthOfLongestSubstring();
        String s = "abcabcbb";
        int result = solver.lengthOfLongestSubstring(s);
        System.out.println("Length of longest substring: " + result); // Output: 3
    }
}
