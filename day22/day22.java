package day22;


public class day22{
    Node head;
    public class Node{
        int data;
        Node next;
    
        Node(int d){
            data = d;
            next = null;
        }
    }
    public static void print(Node head){
        if(head == null){
            System.out.println("empty list");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        
    }
}