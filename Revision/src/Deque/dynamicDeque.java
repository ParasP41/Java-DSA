package Deque;

public class dynamicDeque extends customDeque {
    public dynamicDeque() {
        super();
    }

    public dynamicDeque(int size) {
        super(size);
    }

    @Override
    public void insert(int item) {
        if (this.isFull()) {
            int[] arr = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                arr[i] = data[(front + i) % data.length];
            }
            front=0;
            end=data.length;
            data=arr;
        }
        super.insert(item);
    }
}
