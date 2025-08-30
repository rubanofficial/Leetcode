class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(fruits[i] <= baskets[j]){
                    baskets[j] = baskets[j] * 0;
                    break;
                }
            }
        }
        int c =0;
        for(int i: baskets){
            if(i != 0){
                c++;
            }
        }
        return c;
    }
}