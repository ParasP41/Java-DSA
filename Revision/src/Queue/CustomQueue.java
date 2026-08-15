package Queue;

public class CustomQueue {
    int[] data;
    final int DEFAULT_SIZE = 10;
    int ptr = 0;

    public CustomQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

        public boolean isFull() {
            return ptr == data.length;
        }

        public boolean isEmpty() {
            return ptr == 0;
        }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        data[ptr++] = item;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = 0; i < ptr - 1; i++) {
            data[i] = data[i + 1];
        }
        ptr--;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return data[0];
    }

    public void display() {
        System.out.print("FRONT ");
        for (int i = 0; i < ptr; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("REAR");
    }
}
