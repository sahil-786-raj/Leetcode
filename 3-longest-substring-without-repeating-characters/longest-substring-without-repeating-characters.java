class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> hm = new HashMap<>();

        int l=0; 
        int r=0;
        int maxlen = 0;

        while(r < n){
            if(hm.containsKey(s.charAt(r))){
                if(hm.get(s.charAt(r)) >= l){
                    l = hm.get(s.charAt(r)) + 1;
                }
            }
            int length = r-l+1;
            maxlen = Math.max(length, maxlen);
            hm.put(s.charAt(r), r);
            r++;
        }

        return maxlen;
    }
}