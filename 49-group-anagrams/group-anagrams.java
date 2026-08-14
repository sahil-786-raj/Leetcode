class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List> hm = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            int count[] = new int[26];

            String s = strs[i];
            for(char ch :  s.toCharArray()){
                int idx = ch-'a';
                count[idx]++;
            }

            StringBuilder sb = new StringBuilder();

            for(int j=0; j<26; j++){
                sb.append("#");
                sb.append(count[j]);
            }

            String key = sb.toString();

            if(!hm.containsKey(key)){
                hm.put(key, new ArrayList<String>());
            }

            hm.get(key).add(s);
        }

        return new ArrayList(hm.values());
    }
}