class Solution {
    public int[] twoSum(int[] n, int target) {
        int l = 0;
        int r = n.length-1;
        while(l<r){
            if(n[l]+n[r]==target){
                return new int []{l+1,r+1};
            }
            else if(n[l]+n[r]<target){
                l++;
            }
            else{
                r--;
            }
        }
        return new int[]{};
    }
}