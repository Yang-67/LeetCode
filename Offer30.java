class MinStack {
    Stack<Integer> st;
   
    /** initialize your data structure here. */
    public MinStack() {
         st = new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int min() {
        int minSum = st.peek();
        for (Integer x : st){
            if(minSum > x)
                minSum = x;
        }
        return minSum;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */

 /**
  * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
  *调用 min、push 及 pop 的时间复杂度都是 O(1)。
  */