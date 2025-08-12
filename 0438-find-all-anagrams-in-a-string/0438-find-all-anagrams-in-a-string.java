class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> res = new ArrayList<>();
        int [] freq = new int [26];
        int [] k = new int [26];
        if(s.length() < p.length()){
            return res;
        }
        for(int i=0;i<p.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(char i : p.toCharArray()){
            k[i-'a']++;
        }
        if(Arrays.equals(freq,k)){
            res.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            freq[s.charAt(i-p.length())-'a']--;
            freq[s.charAt(i)-'a']++;
            if(Arrays.equals(freq,k)){
                res.add(i-p.length()+1);
            }
        }
        return res;
    }
}