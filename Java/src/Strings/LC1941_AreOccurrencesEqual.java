package Strings;
import java.util.HashMap;
import java.util.Map;

public class LC1941_AreOccurrencesEqual {

    public boolean areOccurrencesEqual(String s) {
        if (s.length() == 0) return false;

        Map<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        int target = -1;
        for (int freq : hm.values()) {
            if (target == -1) target = freq;
            else if (freq != target) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        LC1941_AreOccurrencesEqual solver = new LC1941_AreOccurrencesEqual();
        String input = "abacbc";
        boolean result = solver.areOccurrencesEqual(input);
        System.out.println("All characters have equal occurrences? " + result);  // Output: true
    }
}
