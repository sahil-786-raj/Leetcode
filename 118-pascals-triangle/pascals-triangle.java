class Solution {
    public static void getentirerow(int idx, ArrayList<Integer> list, List<List<Integer>> res){
        long ans = 1;
        list.add((int)ans);
        for(int i=1; i<idx; i++){
            ans = ans*(idx-i);
            ans = ans/i;
            list.add((int)ans);
        }
       res.add(new ArrayList<>(list));
       list.clear();
    }
    public List<List<Integer>> generate(int numRows) {
        ArrayList<Integer> list = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        for(int i=1; i<=numRows; i++){
            getentirerow(i, list, res);
        }

        return res;
    }
}