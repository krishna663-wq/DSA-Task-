class Solution {
    public int[] searchRange(int[] nums, int tar) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int lo = 0;
        int hi = nums.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;

            if(nums[mid]==tar){
                ans[0] = mid;
                hi = mid-1;
            } else if(nums[mid]>tar){
                hi = mid-1;
            } else{
                lo = mid +1;
            }
        }
         
        // last occurance
        lo = 0;
        hi = nums.length -1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;

            if(nums[mid]==tar){
                ans[1] = mid;
                lo = mid+1;
            } else if(nums[mid]>tar){
                hi = mid-1;
            } else{
                lo = mid +1;
            }
        }
        return ans;
    }
}