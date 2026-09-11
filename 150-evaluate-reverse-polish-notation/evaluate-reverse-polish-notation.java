class Solution {
    public static int cal(int a, int b, String str){
        if(str.equals("+")){
            return a+b;
        }
        if(str.equals("-")){
            return b-a;
        }
        if(str.equals("*")){
            return a * b;
        }
        if(str.equals("/")){
            return b/a;
        }

        return 0;

    }
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<n; i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int a = s.peek();
                s.pop();
                int b = s.peek();
                s.pop();
                
                int c = cal(a, b, tokens[i]);

                s.push(c);
            }else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }

        return s.pop();
    }
}