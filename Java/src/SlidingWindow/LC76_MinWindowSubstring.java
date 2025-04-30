package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LC76_MinWindowSubstring {

    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0 || t.length() > s.length()) return "";

        Map<Character, Integer> target = new HashMap<>();
        for (char c : t.toCharArray())
            target.put(c, target.getOrDefault(c, 0) + 1);

        Map<Character, Integer> window = new HashMap<>();
        int required = target.size();
        int formed = 0;

        int l = 0, r = 0;
        int minLen = Integer.MAX_VALUE;
        int startIdx = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (target.containsKey(c) && window.get(c).intValue() == target.get(c).intValue()) {
                formed++;
            }

            while (l <= r && formed == required) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIdx = l;
                }

                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);
                if (target.containsKey(leftChar) && window.get(leftChar).intValue() < target.get(leftChar).intValue()) {
                    formed--;
                }
                l++;
            }
            r++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIdx, startIdx + minLen);
    }

    public static void main(String[] args) {
        LC76_MinWindowSubstring solver = new LC76_MinWindowSubstring();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = solver.minWindow(s, t);
        System.out.println("Minimum window substring: " + result);  // Output: "BANC"
    }
}


/**
 * class Solution {
 *     public String minWindow(String s, String t) {
 *         if(t.length()==0 || (t.length()>s.length())) return "";
 *
 *         HashMap<Character,Integer> hm=new HashMap<>();
 *         for (char c:t.toCharArray()) hm.put(c,hm.getOrDefault(c,0)+1);
 *
 *         HashMap<Character,Integer> solution=new HashMap<>();
 *         String output="";
 *         String intres="";
 *         char[] sstring=s.toCharArray();
 *         int i=0,j=0;
 *
 *         while(j<sstring.length){
 *             solution.put(sstring[j],solution.getOrDefault(sstring[j],0)+1);
 *             if (isCovered(hm,solution)){
 *                 intres = s.substring(i, j + 1);
 *                 if(output.length()>intres.length() || output.isEmpty()) output=intres;
 *                 while(i<=j && isCovered(hm,solution)){
 *                     solution.put(sstring[i],solution.getOrDefault(sstring[i],0)-1);
 *                     if (solution.get(sstring[i])==0) solution.remove(sstring[i]);
 *                     intres = s.substring(i, j + 1);
 *                     if(output.length()>intres.length()) output=intres;
 *                     i++;
 *                 }
 *             }
 *             j++;
 *          }
 *
 *         return output;
 *     }
 *
 *     public static boolean isCovered(Map<Character, Integer> hm1, Map<Character, Integer> hm2) {
 *         for (Map.Entry<Character, Integer> entry : hm1.entrySet()) {
 *             char key = entry.getKey();
 *             int count = entry.getValue();
 *             if (hm2.getOrDefault(key, 0) < count) {
 *                 return false;
 *             }
 *         }
 *         return true;
 *     }
 * }
 */
