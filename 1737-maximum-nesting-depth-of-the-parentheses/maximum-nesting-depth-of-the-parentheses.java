class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();

        int max = 0;
        int count = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }

            if(s.charAt(i) == ')'){
                count = st.size();
                max = Math.max(max, count);
                st.pop();
            }
        }

        return max;
    }
}