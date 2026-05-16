class Solution {
    void helper(int [][] grid , int i,int j){
        if(i>grid.length-1 || i<0 || j>grid[0].length-1 || j<0){
            return;
        }
        if(grid[i][j] == 0){
            return;
        }
        if(grid[i][j] == 1){
            grid[i][j] = 0;
        }
        helper(grid,i+1,j);
        helper(grid,i-1,j);
        helper(grid,i,j+1);
        helper(grid,i,j-1);
    }
    public int numEnclaves(int[][] grid) {
        int sum = 0;
        for(int j=0;j<grid[0].length;j++){
            if(grid[0][j] == 1){
                helper(grid,0,j);
            }
        }
        for(int i=0;i<grid.length;i++){
            if(grid[i][grid[0].length-1] == 1){
                helper(grid,i,grid[0].length-1);
            }
        }
        for(int j=0;j<grid[0].length;j++){
            if(grid[grid.length-1][j] == 1){
                helper(grid,grid.length-1,j);
            }
        }
        for(int i=0;i<grid.length;i++){
            if(grid[i][0] == 1){
                helper(grid,i,0);
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    sum++;
                }
            }
        }
        return sum;
    }
}