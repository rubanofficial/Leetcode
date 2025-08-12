class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int s =0;
        int sum =0;
        int min = Integer.MAX_VALUE;
        for(int e=0;e<nums.length;e++){
            sum += nums[e];
            while(sum>=target){
                min = Math.min(min,e-s+1);
                sum = sum - nums[s];
                s++;
                
            }
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}