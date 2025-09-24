class Solution {
    void cs(List<Integer>com,List<List<Integer>>res,int []can,int t,int curr){
        if(t == 0){
            res.add(new ArrayList<>(com));
        }
        if(t<0){
            return;
        }
        for(int i=curr;i<can.length;i++){ 
            if (i > curr && can[i] == can[i - 1]) continue;  
            com.add(can[i]);
            cs(com,res,can,t-can[i],i+1);
            com.remove(com.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] can, int t) {
        List<Integer> com = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(can);   
        cs(com,res,can,t,0);
        return res;
    }
}