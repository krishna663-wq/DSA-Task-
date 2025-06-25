class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length() > typed.length()){
            return false;
        }
        
        int i = 0;
        int j = 0;

        if(name.charAt(i) != typed.charAt(j)){
                return false;
            }
        while(i < name.length() && j < typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            } 
            else if(typed.charAt(j) == name.charAt(i-1)){
                j++;
            } else{
                return false;
            }
        }
        while(j<typed.length()){
            if(typed.charAt(j)==name.charAt(i-1)){
                j++;
            }
            else{
                return false;
            }
        }
        return i == name.length() && j == typed.length();
        
    }
}