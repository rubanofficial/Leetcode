class Solution {
    public String reverseVowels(String s) {
        char [] res = s.toCharArray();
        int i = 0;
        int j = res.length-1;
        while(i<j){
            while(i<j && !(res[i] == 'a' || res[i] == 'e' || res[i] == 'i' || res[i] == 'o' || res[i] == 'u' || res[i] =='A' || res[i] =='E' ||res[i] == 'I'|| res[i] == 'O' || res[i] =='U'  )){
                i++;
            }
            while(i<j && !(res[j] == 'a' || res[j] == 'e' || res[j] == 'i' || res[j] == 'o' || res[j] == 'u' || res[j] =='A' || res[j] =='E' ||res[j] == 'I'|| res[j] == 'O' || res[j] =='U'  )){
                j--;
            }
            char t = res[i];
            res[i] = res[j];
            res[j] = t; 
            i++;
            j--;
        }
    return new String(res);
    }
}