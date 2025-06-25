class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max = 0;
        int chunk = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(i == max){
                chunk++;
            }
        }
        return chunk;
    }
}