class Solution {
    public int maximumLengthSubstring(String s) {
        int c =0;
        int max =0;
        for(int l=0;l<s.length();l++){
            HashMap<Character,Integer> res = new HashMap<>();
            c=0;
            for(int r=l;r<s.length();r++){
                res.put(s.charAt(r), res.getOrDefault(s.charAt(r),0)+1);
                int n = res.get(s.charAt(r));
                if(n>2){
                    break;
                }
                c = r-l+1;
                
            }
            max = Math.max(c,max);
        }
        return max;
    }
}