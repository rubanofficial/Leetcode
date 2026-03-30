class Solution {
    public boolean canFinish(int numCourses, int[][] prs) {
        int[] ind = new int[numCourses];
        ArrayList<Integer>[] gr = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            gr[i] = new ArrayList<>();
        }
        for(int i=0;i<prs.length;i++){
            int a =  prs[i][0];
            int b =  prs[i][1];
            gr[b].add(a);
            ind[a]++;
        }
        Queue <Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(ind[i] == 0){
                q.offer(i);
            }
        }
        int c = 0;
        while(!q.isEmpty()){
            int v = q.poll();
            c++; 
            for(int i : gr[v]){
                ind[i]--;
                if(ind[i] == 0){
                    q.offer(i);
                }
            }
        }
        return c == numCourses;
    }
}