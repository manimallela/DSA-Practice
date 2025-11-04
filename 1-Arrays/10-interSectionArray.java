class Solution {
    public int[] interSectionArray(int[] nums1, int[] nums2) {
        int[] nums = new int[Math.min(nums1.length, nums2.length)];
        int p = 0, p1 = 0, p2 = 0;

        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] < nums2[p2]) {
                p1++;
            } else if (nums1[p1] > nums2[p2]) {
                p2++;
            } else {
                if (p == 0 || nums[p - 1] != nums1[p1]) {
                    nums[p++] = nums1[p1];
                }
                p1++;
                p2++;
            }
        }
        return Arrays.copyOf(nums, p);
    }
}
