class Solution {
    public String[] findWords(String[] words) {
        String r1  = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";

        Set<Character> set1 = createSet(r1);
        Set<Character> set2 = createSet(r2);
        Set<Character> set3 = createSet(r3);

        List<String> result = new ArrayList<>();
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            if (isValid(lowerWord, set1) || isValid(lowerWord, set2) || isValid(lowerWord, set3)) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }
    
    private Set<Character> createSet(String row) {
        Set<Character> set = new HashSet<>();
        for (char c : row.toCharArray()) {
            set.add(c);
        }
        return set;
    }
    
    private boolean isValid(String word, Set<Character> rowSet) {
        for (char c : word.toCharArray()) {
            if (!rowSet.contains(c)) {
                return false;
            }
        }
        return true;
    }
}