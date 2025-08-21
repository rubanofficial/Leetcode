class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max = 0;
        for(int i : nums){
            for(int j : nums){
                if(Math.abs(i-j) <= Math.min(i,j)){
                    max = Math.max(i^j, max);
                }
                
            }
        }
        return max;
    }
}