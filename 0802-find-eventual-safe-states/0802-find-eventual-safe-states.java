class Solution {
    boolean dfs(int i, int [] state, int [][] graph){
        if(state[i] != 0){
            return state[i] == 2;
        }
        state[i] = 1;
        for(int n : graph[i]){
            if(!dfs(n,state,graph)){
                return false;
            }
        }
        state[i] = 2;
        return true;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<Integer> res = new ArrayList<>();
        int [] state = new int [graph.length];
        for(int i=0;i<graph.length;i++){
            if(dfs(i,state,graph)){
                res.add(i);
            }
        }
        return res;
    }
}