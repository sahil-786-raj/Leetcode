class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm =  new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>(); 
        
        for (Integer k : hm.keySet()) { 
            if (!set.add(hm.get(k))) { 
                return false; 
            } 
        } 
        
        return true;
    }
}