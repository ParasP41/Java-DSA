package LinkedList;

public class DLL {

    int size;
    Node head;
    Node tail;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    //when you have no tail given then
    public void insertLast(int val) {
        Node node = new Node(val);
        node.next = null;

        // If list is empty
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        // Traverse to the LAST node
        Node last = head;
        while (last.next != null) {   // ✔ stop at last node
            last = last.next;
        }

        // Link the new node
        last.next = node;
        node.prev = last;
    }

    public Node find (int index){
        Node node=head;
        for (int i = 1; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public void insert(int after,int val){
            Node p=find(after);
            if (p==null){
                System.out.println("Does not exist");
                return;
            }
            Node node=new Node(val);
            node.next=p.next;
            p.next=node;
            node.prev=p;
            if (node.next!=null){
            node.next.prev=node;
            }
    }

    public void display() {
        Node node=head;
        while (node!=null){
            System.out.print(node.val+" ⇌ ");
            node=node.next;
        }
        System.out.println("End");
    }

    public void displayRev(){
        Node node=tail;
        System.out.print("Start");
        while (node!=null){
            System.out.print(" ⇌ "+node.val);
            node=node.prev;
        }
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
