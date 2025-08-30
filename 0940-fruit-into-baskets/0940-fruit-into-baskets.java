class Solution {
    public int totalFruit(int[] f) {
        HashMap <Integer,Integer> res = new HashMap<>();
        int max =0;
        int l =0;
        for(int r=0;r<f.length;r++){
            res.put(f[r], res.getOrDefault(f[r],0)+1);
            while(res.size()>2){
                res.put(f[l],res.get(f[l])-1);
                if(res.get(f[l]) == 0){
                    res.remove(f[l]);
                }
                l++;
            }
            max = Math.max(max,r-l+1);
        }
        return max;
    }
}