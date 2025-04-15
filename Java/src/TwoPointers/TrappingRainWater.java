package TwoPointers;

public class TrappingRainWater {

    public int trap(int[] height) {
        if (height.length == 0) return 0;

        int l = 0, r = height.length - 1;
        int maxl = height[l], maxr = height[r];
        int res = 0;

        while (l < r) {
            if (maxl < maxr) {
                l++;
                maxl = Math.max(maxl, height[l]);
                res += maxl - height[l];
            } else {
                r--;
                maxr = Math.max(maxr, height[r]);
                res += maxr - height[r];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        TrappingRainWater solver = new TrappingRainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = solver.trap(height);
        System.out.println("Trapped water: " + result);
    }
}
