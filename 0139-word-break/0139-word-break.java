class Solution {
    Boolean[] dp;
    boolean helper(int i,String s, List<String> word){
        if(i == s.length()){
            return true;
        }
        if (dp[i] != null) return dp[i];
        String res = "";
        for(int j =i;j<s.length();j++){
            res = res + s.charAt(j);
            if(word.contains(res)){
                if(helper(j+1,s,word)){
                    return dp[i] = true;
                }
            }
        }
        return dp[i] = false;
    }  
    public boolean wordBreak(String s, List<String> word) {
        dp = new Boolean[s.length()];
        return helper(0,s,word);
    }
}