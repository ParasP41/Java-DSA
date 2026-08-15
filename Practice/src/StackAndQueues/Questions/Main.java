package StackAndQueues.Questions;

public class Main {
    public static void main(String[] args) {
        StacksToQueue Queue=new StacksToQueue(5);
        Queue.push(1);
        Queue.push(2);
        Queue.push(3);
        Queue.push(4);
        Queue.push(5);
        Queue.display();
        Queue.pop();
        Queue.display();
    }
}
