class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> res = new Stack<>();
        int [] arr = new int [t.length];
        for(int i=t.length-1;i>=0;i--){
            while(!res.isEmpty() && t[res.peek()]<=t[i]){
                res.pop();
            }
            arr[i] = res.isEmpty() ? 0 : res.peek()-i;
            res.push(i);
        }
        return arr;
    }
}