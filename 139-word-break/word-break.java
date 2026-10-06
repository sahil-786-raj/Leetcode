class Solution {
    public static boolean segment(String s, int i, int j, List<String> wordDict, int dp[][]){
        String curr = s.substring(i, j+1);

        if(wordDict.contains(curr)){
            return true;
        }

        if(dp[i][j] != -1){
            return dp[i][j] == 1;
        }
        

        for(int k=i; k<j; k++){
            if(segment(s, i, k, wordDict, dp)  &&  segment(s, k+1, j, wordDict, dp)){
                dp[i][j] = 1;
                return true;
            }
        }

        dp[i][j] = 0;
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        int dp[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                dp[i][j] = -1;
            }
        }
        return segment(s, 0, n-1, wordDict, dp);
    }
}