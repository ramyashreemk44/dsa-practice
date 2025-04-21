package TwoPointers;

public class LC925_IsLongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;

        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }

        return i == name.length();
    }

    public static void main(String[] args) {
        LC925_IsLongPressedName solver = new LC925_IsLongPressedName();
        String name = "alex";
        String typed = "aaleex";
        boolean result = solver.isLongPressedName(name, typed);
        System.out.println("Is long pressed? " + result); // Output: true
    }
}
