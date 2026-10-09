package CoreJava;

/*
 * main features-
 * multithreaded
 * oops
 * java-> compiler -> byte code
*/

// JDK, JRE, JVM
// JVM inside JRE inside JDK


// JIT compiler

public class BasicInfo {

	// static variable example 
    static int staticVariable = 12;

    void print(){
    	// local variable 
        int localVarible = 78 ;
    }

    public static void main(String[] args) {
        System.out.println("HELLO WORLD");

        // Variables types ->
        // 1. Local variable 
        // 2. Static variable 
        // 3. Instance variable

        int instanceVarible = 10 ;

        // variable widening
        int value = 45;
        float a = value;

        // overflow of the variable value
        int b=130;
        byte c=(byte)b;

        // Data types in the java
        // primitives - > int , byte, short , long , float , boolean , double , char
        // non primitive -> Integer , string , objects


        // operators in java
        // example - > unary , arithmatic , logical , shift , relational , ternary , bitwise , assignment
        // arithmatic  --> + - * / %
        // unary - ++ , --  , a++, ++a, a--,--a ; 
        
        // assignment operator  - 
        // = , += , -= , *= , %= , |=, &=
        
        // relational ->> == , != , < , > ,<=,>= 
        
        // logical ->> && , || ,! - and or and not
        
        // ternary operator -->> int max  = a >b ? a:b ; 
        // operator precedence
        // unary > arithmatic > shift > relational > bitwise > logical > ternary > asignment

        // keyword - > default words by java - 51 keywords

        // widening and narrowing of the variables

        // data type sizes
        // boolean - 1 bit
        // char - 2 byte
        // byte - 1 byte
        // int - 4 byte
        // short - 2 byte
        // long - 8 byte
        // float - 4 byte
        // double - 8 bute

    }
}
