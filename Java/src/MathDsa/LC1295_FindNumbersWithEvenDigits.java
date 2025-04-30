package MathDsa;

/**
 * a. Problem description:
 * Given an integer array nums, return how many numbers in the array contain an even number of digits.
 *
 * b. Example:
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 *
 * c. My approach description:
 * I used a mathematical approach. For each number, I calculated the number of digits using Math.log10(val) + 1. If the digit count was even, I incremented the result. This avoids converting numbers to strings and is slightly faster.
 */
public class LC1295_FindNumbersWithEvenDigits {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int val : nums) {
            if (((int) Math.log10(val) + 1) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        LC1295_FindNumbersWithEvenDigits solver = new LC1295_FindNumbersWithEvenDigits();
        int[] nums = {12, 345, 2, 6, 7896};
        int result = solver.findNumbers(nums);
        System.out.println("Count of numbers with even digits: " + result);  // Output: 2
    }
}

