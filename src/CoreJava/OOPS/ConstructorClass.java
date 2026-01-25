package CoreJava.OOPS;

class Student1{
    int id ;
    String name ;

    // parameterized constructor
    public Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // default constructor
    public Student1( ) {
        System.out.println("this is default constructor");
    }

    // constructor overloading
    public Student1(int a , int b , int c){
        this.id = a;
    }
}
public class ConstructorClass {
    public static void main(String[] args) {
        Student1 st = new Student1();
        Student1 st1 = new Student1(1,"hello");
        // constructor overloading
        Student1 st2 = new Student1(1,2,3);

    }
}
