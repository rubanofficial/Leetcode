class Solution {
    int find(int x, int p []){
        if(p[x] != x){
            p[x] = find(p[x],p);
        }
        return p[x];
    }
    public int[] findRedundantConnection(int[][] edges) {
        int [] p = new int [edges.length+1];
        for(int i=1;i<=edges.length;i++){
            p[i] = i;
        }
        for(int i=0;i<edges.length;i++){
            int e1 = edges[i][0];
            int e2 = edges[i][1];
            int r1 = find(e1,p);
            int r2 = find(e2,p); 
            if(r1 == r2){
                return new int[] {e1,e2};
            }
            p[r2] = r1;
        }
        return p;
    }
}