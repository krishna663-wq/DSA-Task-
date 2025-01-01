class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int slow = 0;
        int fast = nums.length-1;
        while(slow<fast){
            if(nums[slow] % 2 > nums[fast] % 2){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
            }
            if(nums[slow] % 2 == 0) slow++;
            if(nums[fast] % 2 != 0) fast--;
        }
        return nums;
    }
}