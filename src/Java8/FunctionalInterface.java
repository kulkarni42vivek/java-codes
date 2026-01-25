package Java8;

import java.lang.*;
import java.util.*;

public class FunctionalInterface {
    public static void main(String[] args) {
        // fucntional interfaces are single abstract interface- it has single abstract method
        // used for basis of lambda expressions
        myInterface obj = (x,y)->  x+y ;
        int result = obj.add(45,78);
        System.out.println(result);
    }
}

@java.lang.FunctionalInterface
interface myInterface{
     int add(int x , int y);
}
