package day20;

class car {
    int id;
    car() {
        System.out.println("Car class obj is created");
    }
}

class supercar extends car {
    supercar() {
        super();
    }
}
public class day20{
    public static void main(String[] args) {
        car c = new car();
        supercar s = new supercar();
        c.id = s.id = 1;
    }
}