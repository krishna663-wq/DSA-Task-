class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int lo = 1;
       int max = piles[0];

       for(int i=1;i<piles.length;i++){
        max = Math.max(piles[i],max);
       } 
       long ans = -1;
       int hi = max;
       while(lo<=hi){
        int mid = lo+(hi-lo)/2;
        long hr = 0;
        for(int i=0;i<piles.length;i++){
            hr += (int)Math.ceil(piles[i]*1.0/mid); 
        }
        if(hr<=h){
            ans = mid;
            hi = mid-1;
        } else{
            lo = mid+1;
        }
       }
       return (int)ans;
    }
}