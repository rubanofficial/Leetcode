class Solution {
    void res(int i,int j,char[][] g){
        if(i>g.length-1 || j > g[0].length-1){
            return;
        }
        if(i<0 || j <0){
            return;
        }
        if(g[i][j] == '0'){
            return;
        }
        if(g[i][j] == '1'){
            g[i][j] ='0';
        }
        res(i+1,j,g);
        res(i,j+1,g);
        res(i-1,j,g);
        res(i,j-1,g);
    }
    public int numIslands(char[][] g) {
        int c = 0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j] == '1'){
                    res(i,j,g);
                    c++;
                }
            }
        }
        return c;
    }
}