class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        int[] rotated = new int[n];

        for(int i=0;i<n;i++){
            rotated[(i+k) % n] = arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i] = rotated[i];
        }
    }
}