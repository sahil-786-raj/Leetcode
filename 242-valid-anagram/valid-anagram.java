import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char num = s.charAt(i);
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for(int j=0; j<t.length(); j++){
            if(hm.get(t.charAt(j)) != null){
                if(hm.get(t.charAt(j)) == 1){
                    hm.remove(t.charAt(j));
                }else{
                    hm.put(t.charAt(j), hm.get(t.charAt(j)) - 1);
                }
            }else{
                return false;
            }
        }

        return hm.isEmpty();
    }
}