class Solution {
    public static int palinsub(String s1, String s2, int n, int m, int dp[][]){
        if(n==0 || m==0){
            return 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return dp[n][m] = palinsub(s1,s2,n-1,m-1,dp) + 1;
        }else{
            int ans1 = palinsub(s1,s2,n-1,m,dp);
            int ans2 = palinsub(s1,s2,n,m-1,dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }
    public int longestPalindromeSubseq(String s1) {
        int n = s1.length();
        String s2 = "";
        for(int i=n-1; i>=0; i--){
            s2 = s2+s1.charAt(i);
        }

        int m = s2.length();

        int dp[][] = new int[n+1][m+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        return palinsub(s1,s2,n,m,dp);

    }
}