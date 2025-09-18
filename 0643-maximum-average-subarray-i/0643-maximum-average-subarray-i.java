class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double s = 0;
        double max = 0;
        for(int i=0;i<k;i++){
            s = s + nums[i];
        }
        max = s/k;
        for(int i=k;i<nums.length;i++){
            s = s - nums[i-k] + nums[i];
            max = Math.max(max,s/k);
        }
        return max;
    }
}