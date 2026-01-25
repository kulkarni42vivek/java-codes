package CoreJava.OOPS;
// used for the abstraction
// interface extends interface
// class implements interface

interface Valued{
    void getValue();
}
class Implementor implements  Valued{

    @Override
    public void getValue() {
        System.out.println("test");
    }
}



// multiple inheritance using the interface
interface interface1{
    void method();
}
interface interface2{
    void method();
}
class Test11 implements  interface1 , interface2{

    @Override
    public void method() {
        System.out.println("multiple inheritance");
    }
}

// java 8 interface
interface  Value1{
    void method();
    default void method2(){
        System.out.println("default method in the interface");
    }
}
public class IntefaceClass {
    public static void main(String[] args) {

    }
}
