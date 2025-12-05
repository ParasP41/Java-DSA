package LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.display();
//        list.insertLast(8);
//        list.display();
//        list.insert(9,2);
//        list.insertRec(90,2);
//        list.display();
//        System.out.println(list.deleteFirst());
//
//        list.display();
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(2));
//        list.display();

//        DLL list=new DLL();
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(6);
//         list.display();
//        list.insertLast(8);
//         list.display();
//        list.displayRev();
//        list.find(2);
//        list.insert(2,89);

//        CLL list=new CLL();
//        list.insert(6);
//        list.insert(7);
//        list.insert(8);
//        list.display();

//        LL list=new LL();
//        list.insertFirst(1);
//        list.insertFirst(1);
//        list.insertFirst(1);
//        list.insertFirst(2);
//        list.insertFirst(3);
//        list.insertFirst(3);
//        list.duplicate();
//        list.display();


        LL first=new LL();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        LL second=new LL();
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        LL ans=LL.merge(first,second);
        ans.display();



    }
}
