class Solution {
    public boolean checkIfPangram(String s) {
        int[] sarr = new int[26];

        for(int i=0;i<s.length();i++){
            int idx = s.charAt(i)-'a';
            sarr[idx]++;
        } 
        for(int i=0;i<26;i++){
            if(sarr[i] < 1){
                return false;
            }
        }
        return true;
    }
}