package day63;

public class day63 {
    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int d) {
            data = d;
            next = null;
        }
    }

    public static void add(ListNode head, int data) {
        while (head.next != null) {
            head = head.next;
        }
        head.next = new ListNode(data);
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        if (count == n) {
            return head.next;
        }

        int target = count - n - 1;
        curr = head.next;
        ListNode prev = head;

        for (int i = 0; i < target; i++) {
            curr = curr.next;
            prev = prev.next;
        }

        prev.next = curr.next;

        print(head);
        return head;

    }
    public static int number(ListNode l, int n){
        if(l.next == null){
            return l.data;
        }
        n = number(l.next, n) * 10 + n;
        return n;

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = number(l1, 0);
        int num2 = number(l2, 0);
        int num = num1 + num2;
        System.out.println(num1 + " " + num2);
        System.out.println(num);
        ListNode head = new ListNode(0);
        ListNode curr = head;

        if(num == 0) return head;
        while(num >= 1){
            int x = num % 10;
            ListNode newNode = new ListNode(x);
            curr.next = newNode;
            curr = curr.next;
            num = num /10;
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        add(l1, 4);
        add(l1, 9);

        ListNode l2 = new ListNode(5);
        add(l2, 6);
        add(l2, 4);
        add(l2, 9);

        print(l1);
        print(l2);
        
        ListNode head = addTwoNumbers(l1, l2);
        print(head);
        
    }
}