class Solution {
    public boolean checkPerfectNumber(int num) {
        // In integer (Limit available ) can store below 6 perfect number
        return (num==6 || num==28 || num==496 || num==8128 || num==33550336);
    }
}