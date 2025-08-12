class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Integer> sub = new ArrayList<>();
        int [] arr = new int [s.length()];
        int j =0;
        for(char i : s.toCharArray()){
            arr[j++] = i-'a';
        }
        int st=0;
        int m=0;
        for(int e=0;e<s.length();e++){
            while(st<e && sub.contains(arr[e])){
                sub.remove(Integer.valueOf(arr[st]));
                st++;
            }
            sub.add(arr[e]);
            m= Math.max(m,e-st+1);
        }
        return m;
    }
}