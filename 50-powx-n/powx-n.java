class Solution {
    public double myPow(double x, int n) {
        long N = n;

        if(N < 0){
            x = 1 / x;
            N = -N;
        }

         if(N == 0){
            return 1;
        }

        double halfpower = myPow(x, (int)(N/2));
        double res = halfpower * halfpower;
        if(N%2 != 0){
            res = x * res;
        }
        return res;
    }
}