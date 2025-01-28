class Solution {
    public int reverse(int n) {
        int revn = 0;
        int lastdigit = 0;
        while(n!=0){
            lastdigit = n %10;
            if (revn > Integer.MAX_VALUE / 10 || revn < Integer.MIN_VALUE / 10) {
                return 0;
            }
            n = n/10;
            revn = (revn *10) + lastdigit;
        }
        return revn;
    }
}