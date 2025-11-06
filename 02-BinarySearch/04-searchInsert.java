class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        return recursion(nums, target, low, high);
    }
    int recursion(int[] nums, int target, int low, int high){
        if(low > high) return low;
        int mid = (low + high) / 2; 
        if(nums[mid] == target){
            return mid;
        } else if(nums[mid] > target){
            return recursion(nums, target, low, mid-1);
        } else {
            return recursion(nums, target, mid+1, high);
        }
    }
}
