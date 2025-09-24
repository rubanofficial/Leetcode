class Solution {
    void sub(int [] nums,ArrayList<Integer> com,ArrayList<List<Integer>>res,int curr){
        res.add(new ArrayList<>(com));
        
        
        for(int i=curr;i<nums.length;i++){
            if(i>curr && nums[i] == nums[i-1]){
                continue;
            }
            com.add(nums[i]);
            sub(nums,com,res,i+1);
            com.remove(com.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> com = new ArrayList<>();
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        sub(nums,com,res,0);
        return res;
    }
}