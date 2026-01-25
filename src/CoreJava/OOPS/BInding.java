package CoreJava.OOPS;
// there are two types of binding - static binding and dynamic binding
// when type of object is determined at the compile time is static binding
// when type of object is determined  at the runtime is dynamic binding

class Dog{
    void method(){
        System.out.println("dog method");
    }
}
class baby extends Dog{
    void method(){
        System.out.println("baby method");
    }
}
public class BInding {
    public static void main(String[] args) {
        Dog obj = new Dog(); // compile time binding
        Dog obj2 = new baby(); // runtime binding

        System.out.println(obj instanceof Dog);
        System.out.println(obj2 instanceof Dog);
        System.out.println(obj instanceof baby);
        System.out.println(obj2 instanceof baby);

        // downcastinng of an object
        baby obj3 = (baby) new Dog(); // downcasting
        // this will give error at runtime
    }
}
// --------------- this is important example----------------------

//class Animal { }
//class Dog4 extends Animal {
//    static void method(Animal a) {
//        Dog4 d=(Dog4)a;//downcasting
//        System.out.println("ok downcasting performed");
//    }
//    public static void main (String [] args) {
//        Animal a=new Dog4();
//        Dog4.method(a);
//    }
//}
