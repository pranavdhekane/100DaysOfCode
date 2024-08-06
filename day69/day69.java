package day69;

public class day69 {static class Queue{
    static int arr[];
    static int size;
    static int rear = -1;
    static int front = -1;
    
    Queue(int s){
        arr = new int[s];
        size = s;
    }

    public static boolean isEmpty(){
        if(rear == -1 && front == -1){
            return true;
        }
        return false;
    }

    public static boolean isFull(){
        if(((rear+1) % size) == front){
            return true;
        }
        return false;
    }
    //enque
    public void add(int data){
        if(isFull()){
            System.out.println("Full");
            return;
        }
        //first element condition
        if(front == -1){
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    //dequeue
    public int remove(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        int result = arr[front];
        //single element condition
        if(rear == front){
            front = rear = -1;
        } else {           
            front = (front+1 ) % size;
        }
        return result;
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        return arr[front];
    }
}
public static void main(String[] args) {
    Queue q= new Queue(3);
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);

    System.out.println("Removed "  + q.remove());
    q.add(4);

    while(!Queue.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }
}
}
