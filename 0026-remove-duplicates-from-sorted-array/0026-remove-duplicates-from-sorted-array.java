class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0;
        for(i=0,j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
            nums[++i] = nums[j];
        }
        }
        return i+1;
    }
}