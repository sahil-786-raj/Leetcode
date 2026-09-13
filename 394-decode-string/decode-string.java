class Solution {
    public String decodeString(String s) {
        Stack<String> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == ']') {

                sb.setLength(0);

                while (!s1.peek().equals("[")) {
                    sb.insert(0, s1.pop());
                }

                s1.pop(); 

                int n = s2.pop();

                sb2.setLength(0);

                for (int j = 0; j < n; j++) {
                    sb2.append(sb);
                }

                s1.push(sb2.toString());

            } 
            else if (Character.isDigit(c)) {

                int num = 0;

                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                s2.push(num);

                i--;
            } 
            else {

                s1.push(Character.toString(c));
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!s1.isEmpty()) {
            ans.insert(0, s1.pop());
        }

        return ans.toString();
    }
}