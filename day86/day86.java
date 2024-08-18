package day86;


public class day86 {
    ListNode head;
    public static class ListNode{
        int val;
        ListNode next;

        ListNode(int data, ListNode n){
            this.val = data;
            this.next = n;
        }

        ListNode(int data){
            this.val = data;
            this.next = null;
        }
    }

    public void addLast(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }

        ListNode currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public static int d(int a, int b) {
        int n = 0;
        if (a > b)
            n = b;
        else
            n = a;

        int divisor = 1;
        for (int i = 2; i <= n; i++) {
            if (a % i == 0 && b % i == 0) {
                divisor = i;
            }
        }
        return divisor;
    }

    public void insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr.next != null){
            int divisor = d(curr.val, curr.val);
            curr.next = new ListNode(divisor, curr.next);
            curr = curr.next.next;
        }

        ListNode c = head;
        while(c != null){
            System.out.print(c.val + " -> ");
        }
        System.out.println();
        // return head;
    }

    public static void main(String[] args) {
        day86 a = new day86();

        a.addLast(18);
        a.addLast(6);
        a.addLast(10);
        a.addLast(3);

        
        // insertGreatestCommonDivisors(head);
    }
}