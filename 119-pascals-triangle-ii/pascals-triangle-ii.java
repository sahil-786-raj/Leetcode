class Solution {
    public static void getentirerow(int rowIndex, ArrayList<Integer> res){
        long ans = 1;
        res.add((int)ans);
        for(int i=1; i<rowIndex; i++){
            ans = ans*(rowIndex-i);
            ans = ans/i;
            res.add((int)ans);
        }
    }
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> res = new ArrayList<>();

        getentirerow(rowIndex+1, res);

        return res;
    }
}