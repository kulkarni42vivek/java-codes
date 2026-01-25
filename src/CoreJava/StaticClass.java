package CoreJava;

// static can be method , variable , nested class
// static is used for the memory management
// static - gets memory once it is loaded
//If you apply static keyword with any method, it is known as static method.
//A static method belongs to the class rather than the object of a class.
//A static method can be invoked without the need for creating an instance of a class.
//A static method can access static data member and can change the value of it.

class Counter {
    static int count = 0 ;
    Counter(){
        count++;
    }
    int getCounter(){
        return count;
    }
    // static method
    static int getValue(){
        return count ;
    }


}
public class StaticClass {
    // static block
    static{
        System.out.println("this is the static block");
    }
    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.count);
        System.out.println(c1.getCounter());
        System.out.println(c2.getCounter());

        // static method
        System.out.println(Counter.getValue());
    }
}
