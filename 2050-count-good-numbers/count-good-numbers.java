class Solution {
    static long MOD = 1000000007;

    public static long power(int x, long n){
        if(n==0){
            return 1;
        }

        long halfpower = power(x, n/2);

        long halfsq = (halfpower * halfpower) % MOD;
        
        if(n%2 != 0){
            halfsq = (x * halfsq) % MOD;
        }

        return halfsq;

    }

    public int countGoodNumbers(long n) {

        long oddplace = n/2;
        long evenplace = n - oddplace;

        long res1 = power(4, oddplace);
        long res2 = power(5, evenplace);
        
        return (int)((res1 * res2) %  MOD);
    
    }
}
