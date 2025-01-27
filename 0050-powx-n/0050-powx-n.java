class Solution {
    public double myPow(double x, int n) {
        return Pow(x,(long)n);
    }
        public double Pow(double x,long n){
            if(n==0){
            return 1;
            }
            if(n < 0){
                return Pow(1/x,-n);
            }
            if(n%2 ==0){
                return Pow(x*x,n/2);
            }
    return x*Pow(x*x,(n-1)/2);
    }
}