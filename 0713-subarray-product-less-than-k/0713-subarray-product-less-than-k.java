class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int max = 0;
        int mul = 1;
        int l = 0;
        for(int r=0;r<nums.length;r++){
            mul = mul * nums[r];
            while(mul >= k){
                mul = mul/nums[l];
                l++;
            }
            max = max + (r-l+1);
        }
        return max;
    }
}