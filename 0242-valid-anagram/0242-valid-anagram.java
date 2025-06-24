class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        int[] sarr = new int[26];

        for(int i=0;i<s.length();i++){
            int idx= s.charAt(i)-'a';
            sarr[idx]++;
        }
        int[] tarr = new int[26];

        for(int i=0;i<t.length();i++){
            int idx = t.charAt(i)-'a';
            tarr[idx]++;
        }
        for(int i=0;i<26;i++){
            if(sarr[i] != tarr[i]){
            return false;
            }
        }     
        return true;
    }
}