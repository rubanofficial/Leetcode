class Solution {
    public int longestOnes(int[] nums, int k) {
        int z =0;
        int ones =0;
        int l =0;
        int max = 0;
        for(int r=0;r<nums.length;r++){
            if(nums[r] == 1){
                ones++;
            }
            else{
                z++;
            }
            while(z>k && l<=r){
                if(nums[l] == 1){
                    ones--;
                }
                else{
                    z--;
                }
                l++;
            }
            
            System.out.println(l);
            max = Math.max(r-l+1,max);
        }
        return max;
    }
}