class Solution {
    public int search(int[] nums, int t) {
        int l=0;
        int r = nums.length-1;
        while(l<=r){
            int m = (r+l)/2;
            if(t == nums[m]){
                return m;
            }
            else if(t<nums[m]){
                r = m-1;
            }
            else if(t>nums[m]){
                l = m+1;
            }
        }
        return -1;
    }
}