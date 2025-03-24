class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        int mask = 1; // counting from the right side
        for(int i=0;i<32;i++){
            if((n & mask) != 0){
                count++;
            }
            mask <<= 1;
        }
        return count;
    }
}