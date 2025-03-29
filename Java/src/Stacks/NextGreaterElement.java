package Stacks;
import java.util.HashMap;
import java.util.Stack;
public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Build the map for next greater elements in nums2
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            nextGreaterMap.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());
            stack.push(nums2[i]);
        }

        // Build the result for nums1
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }

    public static void main(String[] args) {
        NextGreaterElement solver = new NextGreaterElement();

        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int[] result = solver.nextGreaterElement(nums1, nums2);

        System.out.print("Result: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
