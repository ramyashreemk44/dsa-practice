package Strings;

public class LC14_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String res = "";
        int minlen = Integer.MAX_VALUE;

        for (String s : strs)
            minlen = Math.min(minlen, s.length());

        for (int i = 0; i <= minlen; i++) {
            String curstr = strs[0].substring(0, i);
            for (String s : strs) {
                if (!s.substring(0, i).equals(curstr)) return res;
            }
            res = curstr;
        }
        return res;
    }

    public static void main(String[] args) {
        LC14_LongestCommonPrefix solver = new LC14_LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        String result = solver.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);
    }
}
