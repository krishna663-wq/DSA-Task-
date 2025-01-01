class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0, odd = 1; // Pointers for even and odd indices
        int n = nums.length;
        
        while (even < n && odd < n) {
            // Check if even pointer is at the correct position
            if (nums[even] % 2 == 0) {
                even += 2;
            } 
            // Check if odd pointer is at the correct position
            else if (nums[odd] % 2 == 1) {
                odd += 2;
            } 
            // If pointers are not correct, swap
            else {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                even += 2;
                odd += 2;
            }
        }
        return nums;
    }
}
