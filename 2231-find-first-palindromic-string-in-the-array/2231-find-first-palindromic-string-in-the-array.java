class Solution {
    public String firstPalindrome(String[] words) {
        int l=0;
        for(String i : words){
            int r = i.length()-1;
            l=0;
            char [] res = i.toCharArray();
            for(int j=0;j<i.length()/2;j++){
                char temp= res[l];
                 res[l] = res[r];
                res[r] = temp;
                l++;
                r--;
            }
            if(i.equals(new String(res))){
                return i;
            }
        }
        return "";
    }
}