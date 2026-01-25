package CoreJava.Collections;

import  java.util.*;
public class LinkedListClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(45);
        list.add(78);
        list.add(778);
        list.forEach(x-> {
            System.out.print(x + " ");
        });
        System.out.println();
        System.out.println(list.get(2));
        list.remove();
        System.out.println(list);
        list.add(1,45);
        System.out.println(list);
        System.out.println(list.indexOf(45));
        list.addLast(4578);
        list.addFirst(78870);
        System.out.println(list.get(list.size()-1));
    }
}
