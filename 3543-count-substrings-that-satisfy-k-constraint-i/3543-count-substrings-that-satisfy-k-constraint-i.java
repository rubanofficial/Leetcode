class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int z =0;
        int o = 0;
        int c =0;
        for(int l=0;l<s.length();l++){
            z=0;
            o=0;
            for(int r=l;r<s.length();r++){
                if(s.charAt(r) == '0'){
                    z++;
                }
                else{
                    o++;
                }
                if(!(z>k && o>k)){
                    c++;
                }
            }
        }
        return c;
    }
}