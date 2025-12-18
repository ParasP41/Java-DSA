package StackAndQueues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;
    public CustomStack(){
        this(DEFAULT_SIZE);
        this.data=new int[DEFAULT_SIZE];
    }
    public CustomStack(int size) {
        this.data=new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is Full!!");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws Exception{
        if (isEmpty()){
//            System.out.println("Stack is Empty!!");
//            return false;
            throw new Exception("Cannot pop from an empty Stack");
        }
//        data[ptr]=0;
//        ptr--;
//        return true;
        int remove = data[ptr];
        ptr--;
        return remove;
    }

    public int peek() throws StackException{
            if (isEmpty()){
//            System.out.println("Stack is Empty!!");
//            return false;
                throw new StackException("Cannot peek from an empty Stack");
        }
            return data[ptr];
    }

    public boolean isFull() {
        return ptr==data.length-1; //ptr is at the last index
    }

    public boolean isEmpty() {
        return ptr==-1; //ptr is at the First index
    }

}
