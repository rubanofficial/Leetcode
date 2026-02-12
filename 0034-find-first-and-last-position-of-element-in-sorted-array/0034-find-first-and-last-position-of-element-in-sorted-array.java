class Solution {
    public int[] searchRange(int[] nums, int t) {
        int []res = new int [2];
        int s =-1,e=-1;
        int c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == t && c == 0){
                s = i;
                e = i;
                c++;
            }
            if(nums[i] == t){
                e = i;
            }
        }
        res[0] = s;
        res[1] = e;
        return res;
    }
}