class Solution {
    public int[] findOrder(int n, int[][] prs) {
        ArrayList<Integer>[] adj = new ArrayList[n];
        Queue <Integer> q = new LinkedList<>();
        int []ind = new int [n];
        for(int i =0;i<n;i++){
            adj[i] = new ArrayList<>();
        }
        for(int i=0;i<prs.length;i++){
            int a = prs[i][0];
            int b = prs[i][1];
            adj[b].add(a);
            ind[a]++;
        }
        for(int i =0;i<n;i++){
            if(ind[i] == 0){
                q.offer(i);
            }
        }
        int [] res = new int [n];
        int i = 0;
        int c = 0;
        while(!q.isEmpty()){
            int v = q.poll();
            c++;
            res[i++] = v;
            for(int j : adj[v]){
                ind[j]--;
                if(ind[j] == 0){
                    q.offer(j);
                }
            }
        }
        return c == n ? res : new int [0];
    }
}