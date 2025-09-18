class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int s =0;
        int l = 0;
        int max = Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            s = s + nums[r];
            while(s>=target){
                max = Math.min(r-l+1,max);
                s = s-nums[l];
                l++;
            }
        }
    return max == Integer.MAX_VALUE ? 0 : max;
    }
}