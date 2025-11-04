class Solution {
    public int linearSearch(int[] nums, int target) {
        for(int i = nums.length-1; i > 0; i--){
            if(nums[i] == target){
                System.out.print(i + " ");
            }
        }
        return -1;
    }
}
