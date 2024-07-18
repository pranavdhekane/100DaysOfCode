package day62;

public class day62 {
    public static class Node{
        int data;
        Node next = null;
        Node(int x){
            data = x;
        }
    }

    public static void print(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    
    public static void add(Node head, int data){
        while(head.next != null){
            head = head.next;
        }
        head.next = new Node(data);
    }
    
    public static Node merge(Node h1, Node h2){
        Node head = new Node(0);
        Node curr = head;
        while(h1 != null && h2 != null){
            if(h1.data < h2.data){
                curr.next = h1;
                h1 = h1.next; 
            } else if(h2.data < h1.data) {
                curr.next = h2;
                h2 = h2.next;
            } else {
                curr.next = h1;
                h1 = h1.next; 
                curr.next.next = h2;
                h2 = h2.next;
                curr = curr.next;
            }
            curr = curr.next;
        }
        
        if(h1 != null){
            curr.next = h1;
            h1 = h1.next; 
            curr = curr.next;
        }

        if(h2 != null){
            curr.next = h2;
            h2 = h2.next;
            curr = curr.next;
        }

        return head.next;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node head2 = new Node(1);

        add(head1, 2);
        add(head1, 4);
        add(head2, 3);
        add(head2, 4);

        print(head1);
        print(head2);

        // 1 -> 2 -> 4 -> null
        // 1 -> 3 -> 4 -> null

        Node newhead = merge(head1, head2);
        print(newhead);
        
    }
    
}
