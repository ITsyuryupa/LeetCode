package ITsyuryupa;

public class ClimbingStairs {
    public static int climbStairsRecursion(int n) {
        if (n <= 1) {
            return 1;
        }
        else if (n == 2) {
            return 2;
        }
        return climbStairsRecursion(n - 2) + climbStairsRecursion(n - 1);
    }

    public static int climbStairsFib(int n) {
        if (n == 1) {
            return 1;
        }
        int n1 = 1, n2 = 1, i;
        for (i = 1; i < n; i++) {
            n2 = n2 + n1;
            n1 = n2 - n1;
        }
        return n2;
    }
}
