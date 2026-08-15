package Deque;

public class customDeque {
    int[] data;
    final int DEFAULT_SIZE = 10;
    int front = 0;
    int end = 0;
    int size = 0;

    public customDeque() {
        this.data = new int[DEFAULT_SIZE];
    }
    public customDeque(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Deque is Full");
            return;
        }
        end = end % data.length;
        data[end] = item;
        end++;
        size++;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Deque is empty");
        }
        int val = data[front];
        front = (front + 1) % data.length;
        size--;
        return val;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Deque is empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        int i=front;
      do {
          System.out.print(data[i]+",");
          i++;
          i%=data.length;
      }while (i!=end);
        System.out.println(end);
    }
}