package LinkedList;

public class LL {

    Node head;
    Node tail;
    int size;

    public LL() {
        this.size = 0;
    }

    //Insert at the start
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value){
        if (tail==null){
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
//        node.next=null;
        size+=1;
    }

    public void insert(int index,int value){
        if (index==0){
            insertFirst(value);
            return;
        }
        if (index==size){
            insertLast(value);
            return;
        }
//        int i=1;
//        Node node=new Node(value);
//        Node temp=head;
//        while (i<index){
//            temp=temp.next;
//            i++;
//        }
//        node.next=temp.next;
//        temp.next=node;
//        size+=1;

        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size+=1;
    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size-=1;
        return val;
    }

    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }
        Node temp=get(size-2);
        int val=temp.value;
        tail=temp;
        tail.next=null;
        return val;
    }

    public int delete(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index==size){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }

    public Node find(int value){
        Node temp=head;
        while (temp!=null){
            if (temp.value==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void addOne(){
        reverse();
        Node temp = head;
        int carry = 0;
        while (temp != null){
            int afterAdded;
            if(temp == head){
                afterAdded = temp.value + 1 + carry;
            } else {
                afterAdded = temp.value + carry;
            }
            carry = afterAdded / 10;
            afterAdded = afterAdded % 10;
            temp.value = afterAdded;
            if(carry == 0) break;
            temp = temp.next;
        }
        if(carry > 0){
            Node newNode = new Node(carry);
            temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        reverse();
    }

    public void reverse(){
        Node past = null;
        Node present = head;
        Node future;

        while(present != null){
            future = present.next;
            present.next = past;
            past = present;
            present = future;
        }

        tail = head;
        head = past;
    }

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
