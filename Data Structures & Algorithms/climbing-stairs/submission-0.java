class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climb(n, memo);
    }

    private int climb(int i, int[] memo) {
        if (i <= 2) return i;
        if (memo[i] != 0) return memo[i];
        memo[i] = climb(i - 1, memo) + climb(i - 2, memo);
        return memo[i];
    }
}
