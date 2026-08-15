package StackAndQueues.Questions;

public class StacksToQueue {
    int data[];
    final int Default_Size=10;
    int ptr=0;

    public StacksToQueue() {
        this.data = new int[Default_Size];
    }

    public StacksToQueue(int size) {
        this.data = new int[size];
    }

    public boolean isEmpty(){
        return ptr==0;

    }
    public boolean isFull(){
        return ptr==data.length;
    }
    public void push(int item){
        if (isFull()){
            System.out.println("Stack is Full");
            return;
        }
        data[ptr]=item;
        ptr+=1;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        StacksToQueue sample = new StacksToQueue(data.length);

        // move all elements to sample stack (reverse order)
        for (int i = ptr - 1; i >= 0; i--) {
            sample.push(data[i]);
        }

        // remove first inserted element
        int removed = sample.data[--sample.ptr];

        // clear original stack
        ptr = 0;

        // move remaining elements back to original stack
        for (int i = sample.ptr - 1; i >= 0; i--) {
            data[ptr++] = sample.data[i];
        }

        System.out.println("Removed: " + removed);
    }

    public void display(){
        for (int i = 0; i <ptr; i++) {
            System.out.print(data[i]+" -> ");
        }
        System.out.println("END");
    }
}
