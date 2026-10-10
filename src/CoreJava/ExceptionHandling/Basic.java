package CoreJava.ExceptionHandling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


// For basic exception handling 
// Object -->> Throwable 
// error and exception extends throwable 

// error are always unchecked 
// exception can be checked or unchecked 
// checked means compile time 
// runtime are unchecked

// Types of exceptions ->>  1. User defined 2. Built in 
// 1. Runtime 2. Compile time 
// 1. Runtime -> Unchecked 2. Compile Time -> checked

public class Basic {
    // errors -> syntax errors/ compile error, logical errors ,runtime error
    public static void main(String[] args) {
        try{
            int a = 10 /0;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally block");
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println(array[1]); // apple


        // hirarchy
        // object > throwable > error AND Exception
        // error > virtual machine erro and linkage error
        // virtual > out of memory and stack overflow
        // linkage > class format and noclassdeffounderror

        
        String value = "test";
        String value2 = null;
        
        try {
            System.out.println(value + value2);
        }
        catch(ArithmeticException e) {
        	e.printStackTrace();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        finally {
        	System.out.println("finally");
        }
    }
}
