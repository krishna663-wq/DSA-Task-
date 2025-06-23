class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        int count = 0;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                count++;
                left++;
            } else{
                left++;
                right--;
            }
        }
        left = 0;
        right = s.length()-1;
        int cnt2= 0;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                cnt2++;
                right--;
            } else{
                left++;
                right--;
            }
        }
        if(count <= 1 || cnt2 <= 1){
            return true;
        }
        return false;
    }
}