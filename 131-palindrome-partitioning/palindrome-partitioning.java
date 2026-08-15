class Solution {
    boolean ispalin(String part){
        for(int i=0, j=part.length()-1; i<=j; i++, j--){
            if(part.charAt(i) != part.charAt(j)){
                return false;
            }
        }
        return true;
    }

    void getallparts(String s, List<String> partitions, List<List<String>> ans){
        if(s.length() == 0){
            ans.add(new ArrayList(partitions));
            return;
        }

        for(int i=0; i<s.length(); i++){
            String part = s.substring(0, i+1);

            if(ispalin(part)){
                partitions.add(part);
                getallparts(s.substring(i+1), partitions, ans);
                partitions.remove(partitions.size() - 1);
            }
        }
    } 

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();

        List<String> partitions = new ArrayList<>();

        getallparts(s, partitions, ans);

        return ans;

    }
}