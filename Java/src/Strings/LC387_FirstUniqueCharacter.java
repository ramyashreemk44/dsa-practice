package Strings;

public class LC387_FirstUniqueCharacter {

    public int firstUniqChar(String s) {
        int[] ch = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (ch[s.charAt(i) - 'a'] == 1) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        LC387_FirstUniqueCharacter solver = new LC387_FirstUniqueCharacter();
        String input = "leetcode";
        int result = solver.firstUniqChar(input);
        System.out.println("First unique character index: " + result);  // Output: 0
    }
}

