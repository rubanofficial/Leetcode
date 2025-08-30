class Solution {
    public int pivotIndex(int[] nums) {
        int [] prefix = new int [nums.length+1];
        prefix[0] = 0;
        int s = 0;
        for(int i=0;i<nums.length;i++){
            s = s + nums[i];
            prefix[i+1] = s;
        }
        for(int i=1;i<prefix.length;i++){
            if(prefix[i-1]+prefix[i] == prefix[prefix.length-1]){
                return i-1;
            }
        }
        return -1;
    }
}