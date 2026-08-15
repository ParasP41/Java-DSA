package LinkedList;

public class LeetcodeList {

    ListNode head;

    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public void insertFirst(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

