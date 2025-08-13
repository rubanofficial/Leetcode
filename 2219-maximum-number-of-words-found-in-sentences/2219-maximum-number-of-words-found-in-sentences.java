class Solution {
    public int mostWordsFound(String[] sentences) {
        int c =0;
        int max =0;
        for(String i : sentences){
            String []a = i.split(" ");
            c=0;
            for(String j : a){
                c++;
            } 
            max = Math.max(max,c);
        }
        return max;
    }
}