class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length();
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i) == ' '){
                String str = s.substring(i+1);
                return str.length();
            }
        }

        return s.length();
    }
}