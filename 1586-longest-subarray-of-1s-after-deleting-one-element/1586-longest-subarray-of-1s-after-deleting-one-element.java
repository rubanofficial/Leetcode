class Solution {
    public int longestSubarray(int[] nums) {
        int z = 0;
        int r = 0;
        int c = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                c++;
            }
            if(c == nums.length-1){
                return nums.length-1;
            }
        }
        for(int l=0;l<nums.length-1;l++){
            r = l;
            z=0;
            c=0;
            while(z<=1 && r<nums.length){
                if(nums[r] == 0){
                    z++;
                }
                else{
                    c++;
                }
                r++;
            }
            max = Math.max(c,max);
        }
        return max;
    }
}