class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        int lastStart = intervals[0][0];
        int lastEnd = intervals[0][1];

        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] <= lastEnd){
                lastEnd = Math.max(lastEnd , intervals[i][1]);
            }else{
                res.add(Arrays.asList(lastStart, lastEnd));
                lastStart = intervals[i][0];
                lastEnd = intervals[i][1];
            }
        }

        res.add(Arrays.asList(lastStart, lastEnd));

        int[][] ans = new int[res.size()][2];

        for (int i = 0; i < res.size(); i++) {
            ans[i][0] = res.get(i).get(0);
            ans[i][1] = res.get(i).get(1);
        }

        return ans;
    }
}