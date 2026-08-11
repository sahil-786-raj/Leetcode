class Solution {
    public String removeOccurrences(String s, String part) {
        int size = s.length();
        int idx = s.indexOf(part);
        while(size > 0 && idx > -1){
            s = s.substring(0, idx) + s.substring(idx + part.length());
            size = s.length();
            idx = s.indexOf(part);
        }

        return s;
    }
}