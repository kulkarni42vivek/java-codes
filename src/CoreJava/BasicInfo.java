package CoreJava;

/*main features-
multithreaded
oops
java-> compiler -> byte code*/

/*jdk jre jvm
jvm inside jre inside jdk*/

//jit compiler

public class BasicInfo {

    static int staticVariable = 12;

    void print(){
        int localVarible = 78 ;
    }

    public static void main(String[] args) {
        System.out.println("HELLO WORLD");

        /*varibles types ->
        local varible,  static vairalbe , instance variable*/

        int instanceVarible = 10 ;

        // widening
        int value = 45;
        float a = value;

        // overflow of the variable value
        int b=130;
        byte c=(byte)b;

        // data types in the java
        // primitives - > int , byte, short , long , float , boolean , double , char
        // non primitive -> Integeer , string , objects


        // operators in java
        // example - > unary , arithmatic , logical , shift , relational , ternary , bitwise , assignment

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
