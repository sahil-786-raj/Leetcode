class Solution {
    public boolean isfreqsame(int freq1[] , int freq2[]){
        for(int i=0; i<26; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[26];
        for(int i=0; i<s1.length(); i++){
            int idx = s1.charAt(i) - 'a';
            freq[idx]++;
        }

        int windsize = s1.length();

        for(int i=0; i<s2.length(); i++){
            int idx = i;
            int windidx = 0;
            int windfreq[] = new int[26];

            while(windidx < windsize && idx < s2.length()){
                int id = s2.charAt(idx) - 'a';
                windfreq[id]++;
                windidx++;
                idx++;
            }

            if(isfreqsame(freq, windfreq)){
                return true;
            }
        }
        return false;
    }
}