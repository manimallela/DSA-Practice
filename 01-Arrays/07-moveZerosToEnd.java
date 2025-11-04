class Solution {
    public void moveZerosToEnd(int[] nums) {
        int p1 = 0;
        int p = 0;
        while (p1 < nums.length){
            if (nums[p1] != 0){
                nums[p] = nums[p1];
                p++;
            }
            p1++;
        }
        for (int i = p; i < nums.length; i++){
            nums[p] = 0;
            p++;
        }
        for (int num : nums){
            System.out.print(num  + " ");
        }
    }
}
