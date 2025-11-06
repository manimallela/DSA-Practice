class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int floor = -1, ceil = -1;
        return recursion(nums, x, low, high, floor, ceil);
    }
    int[] recursion(int[] nums, int x, int low, int high, int floor, int ceil) {
        if (low > high) return new int[]{floor, ceil};
        int mid = (low + high) / 2;
        if (nums[mid] == x) {
            return new int[]{x, x};
        } else if (nums[mid] < x) {
            floor = nums[mid];
            return recursion(nums, x, mid + 1, high, floor, ceil);
        } else {
            ceil = nums[mid];
            return recursion(nums, x, low, mid - 1, floor, ceil);
        }
    }
}
