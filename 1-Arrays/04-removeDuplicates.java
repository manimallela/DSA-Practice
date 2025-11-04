class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 1;
        int p = 1;
        while(p1 < nums.length){
            if(nums[p1] != nums[p1 - 1]){
                nums[p] = nums[p1];
                p++;
            }
            p1++;
        }
        return p;
    }
}