class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> vow = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int c = 0;
        
        for (int i = 0; i < k; i++) {
            if (vow.contains(s.charAt(i))) {
                c++;
            }
        }
        int max = c;

        // sliding window
        for (int i = k; i < s.length(); i++) {
            if (vow.contains(s.charAt(i - k))) {
                c--; // remove left char
            }
            if (vow.contains(s.charAt(i))) {
                c++; // add right char
            }
            max = Math.max(max, c);
        }

        return max;
    }
}
