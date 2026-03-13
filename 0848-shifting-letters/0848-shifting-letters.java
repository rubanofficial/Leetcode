class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char [] a = s.toCharArray();
        long t = 0;
        for(int i=shifts.length-1;i>=0;i--){
            t = t + shifts[i];
            a[i] = (char)((a[i]-'a' + t)%26 + 'a');
        }
        return new String(a);
    }
}