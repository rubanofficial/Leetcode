class Solution {
    public boolean lemonadeChange(int[] b) {
        int f = 0;
        int t = 0;
        for(int i : b){
            if(i == 5){
                f++;
            }
            else if(i == 10){
                if(f == 0){
                    return false;
                }
                t++;
                f--;
            }
            else{
                if(f>0 && t>0){
                    f--;
                    t--;
                }
                else if(f>=3){
                    f = f- 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}