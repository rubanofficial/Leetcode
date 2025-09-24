class Solution {
    public static void result(int n,int k,List<Integer> com, List<List<Integer>> res,int curr){
        if(com.size()==k){
            res.add(new ArrayList<>(com));
            return ;
        }
        for(int i=curr;i<=n;i++){
            com.add(i);
            result(n,k,com,res,i+1);
            com.remove(com.size()-1);
        }
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> com = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        result(n,k,com,res,1);
        return res;
    }
}