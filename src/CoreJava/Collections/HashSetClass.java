package CoreJava.Collections;

import java.util.*;
public class HashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.add(12);
        a.add(45);
        a.add(12);
        a.add(78);
        System.out.println(a);
        HashSet<Integer> b = new HashSet<>();
        b.addAll(a);
        System.out.println(b.remove(4));
        b.remove(12);
        System.out.println(b);
        System.out.println(b.size());
        System.out.println(b.contains(45));
    }
}
