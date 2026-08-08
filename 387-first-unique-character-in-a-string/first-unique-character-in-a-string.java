import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for(int j=0; j<s.length(); j++){
            if(hm.get(s.charAt(j)) == 1){
                return j;
            }
        }

        return -1;
    }
}