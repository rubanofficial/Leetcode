class Solution {
    public String removeDuplicates(String s) {
        Stack <Character> res = new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            boolean dup = false;
            while(!res.isEmpty() && res.peek()==curr){
                res.pop();
                dup = true;
            }
            if(!dup){
                res.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : res) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}