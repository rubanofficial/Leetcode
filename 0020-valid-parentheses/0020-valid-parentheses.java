class Solution {
    public boolean isValid(String str) {
        Stack <Character> s = new Stack();
        for(char i : str.toCharArray()){
            if(i == '{' || i == '[' || i == '('){
                s.push(i);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if((i == '}' && (s.peek() == '{')) || (i == ']' && (s.peek() == '[')) || (i == ')' && (s.peek() == '(')) ){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}