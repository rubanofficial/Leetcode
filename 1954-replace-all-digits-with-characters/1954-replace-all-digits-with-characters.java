class Solution {
    public String replaceDigits(String s) {
        char [] a = s.toCharArray();
        String b = "";
        for(int i=0;i<s.length();i++){
            if(i%2 == 0){
                b = b + a[i];
            }
            else{
                b = b + (char)(a[i-1] + a[i] - '0');
            }
        }
        return b;
    }
}