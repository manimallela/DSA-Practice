class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> set = new TreeSet<>();
        for (int num : nums1){
            set.add(num);
        }
        for (int num : nums2){
            set.add(num);
        }
        int[] nums = new int[set.size()];
        int i = 0;
        for (int num : set){
            nums[i++] = num;
        }
        return nums;
    }
}

