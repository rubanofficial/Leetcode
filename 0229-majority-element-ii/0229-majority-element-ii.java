class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int can1 = 0,can2 =0,c1=0,c2=0;
        ArrayList <Integer> res = new ArrayList<>();
        for(int i : nums){
            if(c1 == 0  && i!=can2){
                can1 = i;
            }
            else if(c2 ==0 && i!=can1){
                can2 = i;
            }
            if(can1 == i){
                c1++;
            }
            else if(can2==i){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1 = c2 = 0;
        for(int i : nums){
            if(i == can1){
                c1++;
            }
            else if(i == can2){
                c2++;
            }
        }
        if(c1 > nums.length/3){
            res.add(can1);
        }
        if(c2> nums.length/3){
            res.add(can2);
        }
        return res;
    }
}