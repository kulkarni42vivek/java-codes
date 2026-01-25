package CoreJava.OOPS;
// object class is the main parent class to all the other classes like integer , string , array

import java.util.Objects;

class ClassOne{
    int id;
    String name ;
    String value ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClassOne classOne)) return false;
        return id == classOne.id && name.equals(classOne.name) && value.equals(classOne.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, value);
    }
}
public class ObjectClas {
    public static void main(String[] args) {
//        Object obj = new Object();
//        String str = (String) obj;
//        System.out.println(str);
    }
}
