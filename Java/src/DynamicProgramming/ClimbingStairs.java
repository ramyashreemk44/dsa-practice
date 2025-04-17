package DynamicProgramming;

public class ClimbingStairs {

    public int climbStairs(int n) {
        int fstep = 1, sstep = 1, temp = 0;
        int i = 0;
        while (i < n - 1) {
            temp = fstep;
            fstep = fstep + sstep;
            sstep = temp;
            i++;
        }

        return fstep;
    }

    public static void main(String[] args) {
        ClimbingStairs solver = new ClimbingStairs();
        int steps = 5;
        int result = solver.climbStairs(steps);
        System.out.println("Ways to climb " + steps + " steps: " + result);  // Output: 8
    }
}
