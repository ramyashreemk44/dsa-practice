package SlidingWindow;

import java.util.HashMap;

public class LC1358_NumberOfSubstringsContainingAllThreeCharacters {

    public int numberOfSubstrings(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int i = 0, j = 0, count = 0;
        char[] strchar = s.toCharArray();
        int n = strchar.length;

        while (j < n) {
            hm.put(strchar[j], hm.getOrDefault(strchar[j], 0) + 1);

            if (hm.size() == 3) {
                while (i <= j && hm.size() == 3) {
                    count += n - j;
                    hm.put(strchar[i], hm.getOrDefault(strchar[i], 0) - 1);
                    if (hm.get(strchar[i]) == 0) hm.remove(strchar[i]);
                    i++;
                }
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        LC1358_NumberOfSubstringsContainingAllThreeCharacters solver = new LC1358_NumberOfSubstringsContainingAllThreeCharacters();
        String s = "abcabc";
        int result = solver.numberOfSubstrings(s);
        System.out.println("Number of substrings containing 'a', 'b', 'c': " + result); // Output: 10
    }
}

