class Solution {
    public String longestPalindrome(String s) {
        String s1 = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String str = s.substring(i, j + 1);
                if (isPalindrome(str)) {
                    if (str.length() > s1.length()) {
                        s1 = str;
                    }
                }
            }
        }
        return s1;
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
