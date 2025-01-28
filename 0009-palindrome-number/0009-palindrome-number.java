class Solution {
    public boolean isPalindrome(int n) {
        if(n<0) return false;
        int dup = n;
        int revn = 0;
        while(n!=0){
            int last = n % 10;
            n = n/10;
            revn = (revn * 10) + last;

            

        }
        return dup==revn;
        
}
}