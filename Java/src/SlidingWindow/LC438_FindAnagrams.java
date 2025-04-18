package SlidingWindow;

import java.util.*;

public class LC438_FindAnagrams {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;

        int[] charlist = new int[26];
        int[] charorglist = new int[26];

        // Count frequency of characters in p
        for (int i = 0; i < p.length(); i++) {
            charorglist[p.charAt(i) - 'a']++;
        }

        int i = 0, j = 0;
        while (j < s.length()) {
            charlist[s.charAt(j) - 'a']++;

            if (j - i + 1 < p.length()) {
                j++;
            } else {
                if (Arrays.equals(charlist, charorglist)) {
                    ans.add(i);
                }
                charlist[s.charAt(i) - 'a']--;
                i++;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        LC438_FindAnagrams solver = new LC438_FindAnagrams();
        String s = "cbaebabacd";
        String p = "bac";
        List<Integer> result = solver.findAnagrams(s, p);
        System.out.println("Anagram starting indices: " + result); // Output: [0, 6]
    }
}
