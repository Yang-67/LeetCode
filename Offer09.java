class CQueue {
    List<Integer> list;
    public CQueue() {
        list = new ArrayList<>();
    }
    
    public void appendTail(int value) {
        list.add(value);
    }
    
    public int deleteHead() {
        int list0;
        if(list.isEmpty()) 
            return -1;
        else{
            list0 = list.get(0);
            list.remove(0);
            return list0;
        }
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 *用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列
 *尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 */