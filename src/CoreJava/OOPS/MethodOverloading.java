package CoreJava.OOPS;


// method overloading is done with same method name , diffreent parameters
// method cannot be overloaded if it has diffrent return type
// main method aslo can be overloaded
class Nine{
    void method(int a , int b , int c ){
        System.out.println("notaghin");
    }
    void method(int a){
        System.out.println("nothing");
    }
}

class Ten{
    void method(int a , long b){
        System.out.println("");
    }
    void method(int a){
        System.out.println("");
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Nine obj = new Nine();
        obj.method(1);
        obj.method(1,2,3);

        Ten obj2 = new Ten();
        obj2.method(1);
        obj2.method(1,78); // type casting done at compile time
    }
}
