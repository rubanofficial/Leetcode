class Solution {
    public String reverseWords(String s) {
        String res = "";
        String [] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            String e = arr[i];
            for(int j=e.length()-1;j>=0;j--){
                res = res + e.charAt(j);
            }
            if(i != arr.length-1){
                res = res + " ";
            }
        }
    return res;
    }
}