class Solution {
    public int jump(int[] nums) {
        int ce = 0;
        int f = 0;
        int j = 0;
        for(int i = 0;i<nums.length-1;i++){
            f = Math.max(f, i + nums[i]);
            if(i == ce){
                j++;
                ce = f;
            }
        }
        return j;
    }
}