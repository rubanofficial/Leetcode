class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();
        Set<Integer> d = new HashSet<>();
        for(int i : nums1){
            a.add(i);
        }
        for(int i : nums2){
            if(!a.contains(i)){
                b.add(i);
            }
        }
        for(int i : nums2){
            c.add(i);
        }
        for(int i : nums1){
            if(!c.contains(i)){
                d.add(i);
            }
        }
       return Arrays.asList(new ArrayList<>(d), new ArrayList<>(b));


        
    }
}