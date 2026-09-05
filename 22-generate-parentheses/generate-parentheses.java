class Solution {
    public static void genpar(ArrayList<String> a, int n, String s, int open, int close){
        if(s.length() == 2*n){
            a.add(s);
            return;
        }
        
        if(open < n){
            genpar(a, n, s+"(", open+1, close);
        }
        if(close < open){
            genpar(a, n, s+")", open, close+1);
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> a = new ArrayList<>();
        genpar(a, n, "", 0, 0);
        return a;
    }
}