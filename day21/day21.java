package day21;
class one {
    void print(){
        System.out.println("class one");
    }
}
class two extends one {
    void print(){
        System.out.println("class two");
    }
}
class three extends one {
    void print(){
        System.out.println("class three");
    }
}
public class day21{
    public static void main(String[] args) {
        two b = new two();
        three c= new three();

        b.print();
        c.print();
    }
}