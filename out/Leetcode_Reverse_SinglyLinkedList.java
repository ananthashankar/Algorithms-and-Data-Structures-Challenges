public class Leetcode_Reverse_SinglyLinkedList {

    public class ListNode {
        ListNode next;
        int data;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
       ListNode temp = head.next;
       head.next = null;
       
       while(temp != null){
           ListNode nextNode = temp.next;
           temp.next = head;
           head = temp;
           temp = nextNode;
       }
       return head;
    }
}