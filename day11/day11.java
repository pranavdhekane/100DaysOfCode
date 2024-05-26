package day11;

import java.util.*;

public class day11 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(";");
        sj.setEmptyValue("this is empty");
        System.out.println(sj);

        sj.add("pranav");
        sj.add("dhekane");
        sj.add("is");
        sj.add("great");

        System.out.println(sj);

        StringJoiner sj1 = new StringJoiner("_");
        sj1.add("hi");
        sj1.add("my");
        sj1.add("name");
        sj1.add("is");
        sj1.add("pranav");

        System.out.println(sj1);

        sj.merge(sj1);

        System.out.println(sj);
        System.out.println(sj1);
    }
}
