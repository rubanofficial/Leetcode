class Solution {
    int find(int x , int [] p ){
        if(p[x] != x){
            p[x] = find(p[x],p);
        }
        return p[x];
    }
    public int findCircleNum(int[][] is) {
        int [] p = new int [is.length];
        for(int i=0;i<is.length;i++){
            p[i] = i;
        }
        int ans = is.length;
        for(int i=0;i<is.length;i++){
            for(int j=0;j<is[0].length;j++){
                if(is[i][j] == 1){
                    int r1 = find(i,p);
                    int r2 = find(j,p);
                    if(r1 != r2){
                        p[r2] = r1;
                        ans--;
                    }
                }
            }

        }
        return ans;
    }
}