class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        Stack<Integer> s = new Stack<>();
        
        for(int i=n*2-1; i>=0; i--){
            while(!s.isEmpty() && nums[s.peek()] <= nums[i%n]){
                s.pop();
            }
            if(s.isEmpty()){
                arr[i%n] = -1;
            }else{
                arr[i%n] = nums[s.peek()];
            }

            s.push(i%n);
        }
        return arr;  
    }
}