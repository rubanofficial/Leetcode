class Solution {
    public int numberOfSubstrings(String s) {
        int [] ls = {-1,-1,-1};
        int c = 0;
        for(int i=0;i<s.length();i++){
            ls[s.charAt(i)-'a'] = i;
            if(ls[0]!=-1 && ls[1]!=-1 && ls[2]!= -1){
                c = c + (1 + (ls[0]<ls[1]&&ls[0]<ls[2]?ls[0]:ls[1]<ls[2]?ls[1]:ls[2]));
            }
        } 
        return c;
    }
}