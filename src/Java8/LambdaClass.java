package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person{
    int id ;
    String name ;
    float salary;

    public Person(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class LambdaClass {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        Person P1 = new Person(12,"vivek", 45.21F);
        Person P2 = new Person(126,"one", 45.21F);
        Person P3 = new Person(124,"fine", 45.21F);
        list.add(P1);
        list.add(P2);
        list.add(P3);
        List<Person> list1 = list.stream().filter(x->x.getId()<120).collect(Collectors.toList());
        System.out.println(list1);
        List<Person> list2 = list.stream().sorted(Comparator.comparingInt(Person::getId)).collect(Collectors.toList());
        System.out.println(list2);
    }
}
