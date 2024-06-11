package day27;

import java.util.ArrayList;

public class day27 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.get(list.size() -1));

        System.out.println(list.remove(list.size()-1));
        System.out.println(list.remove(list.size()-1));
        System.out.println(list.remove(list.size()-1));
        System.out.println(list.remove(list.size()-1));
        System.out.println(list.remove(list.size()-1));

    }
}