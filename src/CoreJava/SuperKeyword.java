package CoreJava;
// super keyword - used to refer to immediate parent class
// example - check for variable and method
// it can be used to invoke parent class constructor
class Eleven{
    int id = 10;
    Eleven(){
        System.out.println("basic constructor");
    }
    void method(){
        System.out.println("parent class method");
    }
}
class Twelve extends Eleven {
    int id = 25;
    int getSuperId(){
        return super.id;
    }
    void getParentClassMethod(){
        super.method();
    }
    Twelve(){
        super();
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Twelve obj = new Twelve();
        System.out.println(obj.getSuperId());
        obj.getParentClassMethod();

        System.out.println("--------------------");
        Twelve obj2 = new Twelve();

    }
}
