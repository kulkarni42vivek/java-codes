package CoreJava.OOPS;

// class with abstract keyword is abstract class . it can have abstract as well as non abstract method
// abstraction means hiding of the implementation . showing functionality to end user
// there are two ways to achieve abstraction - abstract class , - interface
// abstract class needs to be extended and its methods to be implemented


abstract  class RandomClass{
    abstract int getValue();
    int getKey(){
        return 25;
    }
}
class Rowclass extends RandomClass{

    @Override
    int getValue() {
        return 78;
    }
}


// --------- one use of abstract with the interface---------------------
interface MainInterface{
    void a();
    void b();
    void c();
    void d();
}
abstract class Twenty implements MainInterface{
    public void b(){
        System.out.println("this is B");
    }
}
class TwentyOne extends Twenty{

    @Override
    public void a() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }
}
public class AbstractClass {
    public static void main(String[] args) {

    }
}
