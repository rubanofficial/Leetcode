class Solution {
    int mc(int n , int [] arr,int[] dp){
        if(n==0|| n==1){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int a = mc(n-1,arr,dp) + arr[n-1];
        int b = mc(n-2,arr,dp) + arr[n-2];
        return dp[n] = Math.min(a,b);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        return mc(n,cost,dp);
    }
}