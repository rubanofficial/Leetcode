class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int n = nums.length;
        int max = 0;

        for (int l = 0; l < n; l++) {
            if (nums[l] % 2 != 0 || nums[l] > threshold) continue;

            int r = l;
            while (r + 1 < n && nums[r + 1] <= threshold && (nums[r] % 2 != nums[r + 1] % 2)) {
                r++;
            }

            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}
