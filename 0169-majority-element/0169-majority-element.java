    class Solution {
        public int majorityElement(int[] nums) {
            HashMap <Integer,Integer> res = new HashMap<>();
            int n = nums.length;
            for(int i : nums){
                res.put(i,res.getOrDefault(i,0)+1);
            }
            for(int i: res.keySet()){
                if(res.get(i) > n/2){
                    return i;
                }
            }
            return 0;
        }
    }