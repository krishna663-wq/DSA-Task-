class Solution {
    public int countDigits(int n) {
        int count = 0;
        int original = n;

        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit != 0 && original % lastDigit == 0) {
                count++;
            }
            n = n / 10;
        }

        return count;
    }
}
