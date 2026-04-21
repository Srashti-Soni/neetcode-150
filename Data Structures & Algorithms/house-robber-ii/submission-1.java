class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        return Math.max(helper(nums, 0, dp1, n-1),
                        helper(nums, 1, dp2, n));
    }

    public int helper(int[] nums, int i, int[] dp, int n) {
        if(i >= n) return 0;
        if(dp[i] != -1) return dp[i];

        return dp[i] = Math.max(nums[i] + helper(nums, i+2, dp, n),
                                helper(nums, i+1, dp, n));
    }
}