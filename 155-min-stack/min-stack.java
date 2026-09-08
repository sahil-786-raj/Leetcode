class MinStack {

    // public MinStack() {
        
    // }

    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> minlist = new ArrayList<>();

    public void push(int value) {
        list.add(value);

        if(minlist.isEmpty()){
            minlist.add(value);
        }else{
            minlist.add(Math.min(value, minlist.get(minlist.size()-1)));
        }
    }
    
    public void pop() {
        list.remove(list.size() - 1);
        minlist.remove(minlist.size() - 1);
    }
    
    public int top() {
        return list.get(list.size() - 1);
    }
    
    public int getMin() {
        return minlist.get(minlist.size()  - 1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */