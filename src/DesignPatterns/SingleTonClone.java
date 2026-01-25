package DesignPatterns;

import java.util.HashSet;
import java.util.Objects;

class Emp{
    int id ;
    String name ;

    public int getId(){
        return this.id;
    }
    public void setId(int id ){
        this.id = id ;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public Emp(int id , String name){
        this.id = id ;
        this.name = name;
    }
    public Emp(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id && Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class EmpBuilder{
    int id ;
    String name ;

    public EmpBuilder setName(String name){
        this.name = name;
        return this;
    }
    public EmpBuilder setId(int id){
        this.id  = id ;
        return this;
    }

    public Emp build(){
        Emp emp  = new Emp();
        emp.setId(this.id);
        emp.setName(this.name);
        return emp;
    }

}
class Parent {
    void method() throws RuntimeException{
        System.out.println("hello");
    }
}

public class SingleTonClone {
    public static void main(String[] args) {
        EmpBuilder builder  = new EmpBuilder();
        Emp em = builder.setName("vivek")
                .setId(25).build();
        Emp em2 = builder.setName("vijay")
                .setId(23).build();
        Emp em3 = builder.setName("vivek")
                .setId(25).build();

        System.out.println("--------------------------------------------------------------");

        HashSet<Emp> set = new HashSet<>();
        set.add(em);
        set.add(em2);
        set.add(em3);

        System.out.println(set.toString());

        System.out.println("--------------------------------------------------------------");
        String a= null ;
        String b = "vie";

        System.out.println(b.equals(a));
        System.out.println(Objects.equals(a,b));

    }
}
