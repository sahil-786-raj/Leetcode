class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(!st.isEmpty() && st.peek()== s.charAt(i) ){
                st.pop();
            }
            else if(st.isEmpty() || st.peek() != s.charAt(i)) {
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : st){
            ans.append(ch);
        }
        return ans.toString();
    }
}