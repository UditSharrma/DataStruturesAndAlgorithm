package Stack;

import java.util.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int prt=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        prt++;
        data[prt]=item;
        return true;

    }
    public int pop()throws StackException{
        if (isEmpty()){
            throw new StackException("Stack is Empty");
        }
//        int removed=data[prt];
//        prt--;
//        return removed;
        return data[prt--];
    }
    public int peek()throws StackException{
        if (isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[prt];
    }
    public boolean isFull() {
        return prt==data.length-1;
    }

    public boolean isEmpty(){
        return prt==-1;
    }


}
