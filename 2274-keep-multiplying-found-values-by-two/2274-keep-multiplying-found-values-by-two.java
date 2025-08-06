class Solution {
    public int findFinalValue(int[] nums, int original) {
        int res = 1;
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(original == nums[j]){
                res = nums[j] * 2;
                original = res;
            }
            }
        }
        return original;
    }
}