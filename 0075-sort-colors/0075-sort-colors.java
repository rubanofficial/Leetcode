class Solution {
    public void sortColors(int[] n) {
        int l=0,h = n.length-1,m=0;
        int i =0;
        while(m<=h){
            if(n[m]==0){
                int t = n[l];
                n[l] = n[m];
                n[m] = t;
                l++; 
                m++;
            }
            else if(n[m]==2){
                int t = n[h];
                n[h] = n[m];
                n[m] = t;
                h--;
            }
            else{
                m++;
            }
        }
    }
}