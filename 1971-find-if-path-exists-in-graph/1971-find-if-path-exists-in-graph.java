class Solution {
    boolean ans(int n, int source, int [][] edges,ArrayList<ArrayList<Integer>> arr, int des,int []vis){    
        if(source == des){
            return true;
        }
       vis[source] = 1;
        for(int i : arr.get(source)){
            if(vis[i] !=1){
                if(ans(n, i, edges, arr, des, vis)) { 
                    return true;
                }
            }

        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int des) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(new ArrayList<>());
        }
        int [] vis = new int [n];
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            arr.get(u).add(v);
            arr.get(v).add(u);
        }
        return ans(n,source,edges,arr,des,vis);
    }
}