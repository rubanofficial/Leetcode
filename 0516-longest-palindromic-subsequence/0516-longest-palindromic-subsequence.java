class Solution {
    int[][] memo;
    int helper(String s,int st,int end){
        if(st>end){
            return 0;
        }
        if(st == end){
            return 1;
        }
        if (memo[st][end] != 0){
            return memo[st][end];
        }
           
        if(s.charAt(st) == s.charAt(end)){
            return 2 + helper(s,st+1,end-1);
        }

        return memo[st][end]=Math.max(helper(s,st+1,end),helper(s,st,end-1));
    }
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        memo = new int[n][n];
        return helper(s,0,s.length()-1);
    }
}