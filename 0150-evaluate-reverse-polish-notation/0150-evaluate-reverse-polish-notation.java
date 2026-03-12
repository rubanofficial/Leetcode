class Solution {
    public int evalRPN(String[] tok) {
        Stack <Integer> st = new Stack<>();
        for(String i : tok){
           if(!i.equals("+") && !i.equals("-") && !i.equals("/") && !i.equals("*")){
                int n = Integer.parseInt(i);
                st.push(n);
            }
            else{
                int b = st.pop();
                int a = st.pop();
                if(i.equals("+")){
                    st.push(a+b);
                }
                else if(i.equals("-")){
                    st.push(a-b);
                }
                else if(i.equals("*")){
                    st.push(a*b);
                }
                else if(i.equals("/")){
                    st.push(a/b);
                }
            }
        }
        return st.pop();
    }
}