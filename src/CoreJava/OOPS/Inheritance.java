package CoreJava.OOPS;
import java.util.*;

// inheritance is IS A RELATIONSHIP
// HAS A RELATIONSHIP is in aggregation
class Employee{
    int salary = 41000;
}
// single inheritance
class Programmer extends  Employee{
    int bonus = 1400;
    int getSalary(){
        return bonus + salary;
    }
}

// multi level inheritance
class newEmpl extends Programmer{

}
// hirarchical inheritance
class Intern extends Employee{

}
// multiple inheritance not possible in teh java -
// reason - if class is inheritanmg multiple classes , these multiple classes can have same method with same name.

public class Inheritance {
    public static void main(String[] args) {
        Programmer pro = new Programmer();
        System.out.println(pro.getSalary());
    }
}
