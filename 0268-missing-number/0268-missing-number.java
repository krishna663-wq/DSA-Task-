class Solution {
    public int missingNumber(int[] nums) {
        int XOR= 0;
        for(int i=1;i<=nums.length;i++){
            XOR = XOR^(i^nums[i-1]);
        }
        return XOR;
    }
}