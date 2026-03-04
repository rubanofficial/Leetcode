class Solution {
    int res(int [] dp, int am , int [] c){
        int min = Integer.MAX_VALUE;
        if(am == 0){
            return 0;
        }
        if(am < 0){
            return Integer.MAX_VALUE;
        }
        if(dp[am] != -1){
            return dp[am];
        }
        for(int i : c){
            int count = res(dp,am-i,c);
            if(count != Integer.MAX_VALUE){
                min = Math.min(min,1 + count);
            }
        }
        dp[am] = min;
        return min;
    }
    public int coinChange(int[] coins, int am) {
        int []  dp = new int [am + 1];
        for(int i=0;i<=am;i++){
            dp[i] = -1;
        }
        int ans = res(dp,am,coins);
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}