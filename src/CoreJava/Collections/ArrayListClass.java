package CoreJava.Collections;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i*20);
        }
        for (Integer one:list) {
            System.out.print(one + " ");
        }
        System.out.println("THIS IS LIST -->");
        list.forEach(x->{
            System.out.print(x+ " ");
        });
        list.remove(5);
        System.out.println("THIS IS LIST -->");
        for (Integer i : list) {
            System.out.print(i+" ");
        }
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(180));
        System.out.println(list.get(5));
        list.remove(Integer.valueOf(140));
        System.out.println(list);
        list.set(1,54);
        System.out.println(list);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ListIterator itr2 = list.listIterator();
        while(itr2.hasNext()){
            if((Integer)itr2.next() == 54){
                itr2.set(78);
            }
        }
        System.out.println(list);
        System.out.println("-------------------------------------------");
        System.out.println(list.indexOf(78));

        ArrayList<Integer > a = new ArrayList<>(Arrays.asList(12,78,78,454,48));
        ArrayList<Integer > b = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        a = b ;
        System.out.println(a + "--------> " +b);
        
      

    }
}
