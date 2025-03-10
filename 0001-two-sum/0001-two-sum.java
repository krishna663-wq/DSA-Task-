// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         // int count = 0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums.length;j++){
//                 if(i==j) continue;
//                 if(nums[i] + nums[j] == target) return true;
//             }
//         }
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // j starts from i + 1
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return indices
                }
            }
        }
        return new int[]{}; // Return empty array if no solution
    }
}
