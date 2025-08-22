class Solution {
    public int numberOfAlternatingGroups(int[] col) {
        int c = 0;
        int n = col.length;
        for(int i=0;i<n;i++){
            int p = col[(i-1+n)%n];
            int q = col[(i+1+n)%n];
            if(col[i] != p && col[i]!=q){
                c++;
            }
        }
        
        return c;
    }
}