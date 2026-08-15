package Stack;

import java.util.Queue;

public class customStack {
    int[] data;
    static final int DEFAULT_SIZE = 10;
    int ptr = -1;


    public customStack() {
        this(DEFAULT_SIZE);
    }

    public customStack(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }


    public boolean push(int item) {
        if (!isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }


    public int pop() throws Exception {
        if (!isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int item = data[ptr];
        ptr--;
        return item;
    }

    public int peek() throws Exception {
        if (!isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return data[ptr];
    }


}
