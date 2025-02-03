class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc_length = 1;
        int dec_length = 1;
        int max_length = 1;
        for(int i=1;i<nums.length;i++){
            if (nums[i]>nums[i-1]){
                inc_length++;
                dec_length = 1;
            } else if(nums[i]<nums[i-1]){
                dec_length++;
                inc_length = 1;
            } else{
                inc_length = 1;
                dec_length = 1;
            }
            max_length = Math.max(max_length,Math.max(inc_length,dec_length));
        }
        return max_length;
    }
}