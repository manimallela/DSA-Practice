class Solution {
    public int longestSubarray(int[] nums, int k) {
        int p=0, sum = 0, maxLen = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            while (sum > k && p <= i){
                sum = sum - nums[p];
                p++;
            }
            if (sum == k) maxLen = Math.max(maxLen, i - p + 1);
        }
        return maxLen;
    }
}

