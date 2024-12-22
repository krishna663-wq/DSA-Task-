class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int len = f.length;

        for(int i=0;i<len && n>0;i++){
            boolean isEmpty = f[i] == 0;
            boolean leftEmpty = (i==0 || f[i-1]==0);
            boolean rightEmpty = (i == len-1 || f[i+1]==0);


            if(isEmpty && leftEmpty && rightEmpty){
                f[i] = 1;
                n--;
            }
        }
        return n==0;
    }
}