class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int n:nums){
            sum += n;
            max=Math.max(max,sum);
            if(sum < 0){
                sum = 0;
            }
        }

        return max;
    }
}