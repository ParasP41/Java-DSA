import java.util.*;

public class main {
    public static void main(String[] args) {
        Queue<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a);  // [1, 2, 3]

        Deque<Integer> b = new LinkedList<>();
        while (!a.isEmpty()) {
            b.offerFirst(a.remove());
        }

        System.out.println(b);  // [3, 2, 1]
    }

}

class MyStack {
    Deque<Integer> first;
    Deque<Integer> second;
    public MyStack() {
        first=new LinkedList<>();
        second=new LinkedList<>();
    }

    public void push(int x) {
        first.add(x);
    }

    public int pop() {
        while (!first.isEmpty()){
            second.addLast(first.remove());
        }
        int val=second.pop();
        while(!second.isEmpty()){
            first.addLast(second.remove());
        }
        return val;
    }

    public int top() {
        while (!first.isEmpty()){
            second.addLast(first.remove());
        }
        int val=second.peek();
        while(!second.isEmpty()){
            first.addLast(second.remove());
        }
        return val;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
