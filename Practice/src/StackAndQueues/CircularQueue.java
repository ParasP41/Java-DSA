package StackAndQueues;

public class CircularQueue  {
    protected int[] data;
    protected static final int DEFAULT_SIZE = 10;
    int size = 0;
    int end = 0;
    int front = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
        this.data = new int[DEFAULT_SIZE];
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length; //ptr is at the last index
    }

    public boolean isEmpty() {
        return size == 0; //ptr is at the First index
    }

    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++]=item;
        end=end% data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }
        int removed = data[front++];
        front=front%data.length;
        size--;
        return removed;
    }
    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }
        return data[front];
    }
    public void display() throws Exception {
//        for (int i = front; i < end; i++) {
//            System.out.print(data[i] + " ");
//        }
//        System.out.println("End");

        if (isEmpty()) {
            throw new Exception("queue is empty");
        }
        int i = front;
        do {
            System.out.print(data[i] + " ");
            i++;
            i%=data.length;
        }while (i!=end);
        System.out.println("End");
    }
}
