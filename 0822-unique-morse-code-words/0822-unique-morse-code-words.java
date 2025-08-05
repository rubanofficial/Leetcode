class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet <String> res = new HashSet<>();
        String a = new String();
        for(String i : words){
            a = " ";
            for(char j : i.toCharArray()){
                a = a + code[j-'a'];
            }
            res.add(a);
            System.out.println(a);
        }
        return res.size();
    }
}