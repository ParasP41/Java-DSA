package StackAndQueues;

public class CircularQueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue=new CircularQueue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
    }
}
