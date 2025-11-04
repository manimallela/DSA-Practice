class Solution {
  public int lowerBound(int[] nums, int x) {
    int n = nums.length;
    int ans = n;
    int low = 0, high = n - 1;
    int mid;
    while(low <= high){
      mid = (low + high) / 2;
      if(nums[mid] >= x){
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return ans;
  }
}
