class Solution {
    public static void lettercombi(HashMap<Character, String> keyboard, int i, String digits, ArrayList<String> ans, StringBuilder sb){
        if(i == digits.length()){
            ans.add(sb.toString());
            return;
        }

        String curr = keyboard.get(digits.charAt(i));
        for(int j=0; j<curr.length(); j++){
            sb.append(curr.charAt(j));
            lettercombi(keyboard, i+1, digits, ans, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }


    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();

        if(digits.length() == 0){
            return ans;
        }

        HashMap<Character, String> keyboard = new HashMap<>();
        keyboard.put('2', "abc");
        keyboard.put('3', "def");
        keyboard.put('4', "ghi");
        keyboard.put('5', "jkl");
        keyboard.put('6', "mno");
        keyboard.put('7', "pqrs");
        keyboard.put('8', "tuv");
        keyboard.put('9', "wxyz");

        lettercombi(keyboard, 0, digits, ans, new StringBuilder());

        return ans;
    }
}