class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : words){
            char[] chars = word.toCharArray();
            int left = 0;
            int right = chars.length - 1;

            while(left<right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            result.append(new String(chars)).append(" ");
            
        }
        return result.toString().trim();
    }
}