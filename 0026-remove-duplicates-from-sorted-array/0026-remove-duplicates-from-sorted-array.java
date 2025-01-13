class Solution {
    public int removeDuplicates(int[] nums) {
        // define one variable which will track the distinct element.
        int dist = 1;
        // create a loop to track the each element
        for(int curr=1;curr<nums.length;curr++){
            // Check the current the element of the array with the previous element.
            // if current element is not equal to previous element 
            if(nums[curr] != nums[curr-1]){
                // current element is distinct element.
                nums[dist] = nums[curr];
                dist++;
            } 
        }
            

            

        return dist;
    }
}