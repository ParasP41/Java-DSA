package LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(6);
        list.display();
        list.insertLast(8);
        list.display();
        list.insert(9,2);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}
