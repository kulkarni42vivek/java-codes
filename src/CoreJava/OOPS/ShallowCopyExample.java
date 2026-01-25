package CoreJava.OOPS;

class Address55 {
    String city;

    public Address55(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address55 address;  // Nested object

    public Person(String name, Address55 address) {
        this.name = name;
        this.address = address;
    }

    // Shallow copy using the clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address55 address = new Address55("New York");
        Person person1 = new Person("John", address);

        // Shallow copy of person1
        Person person2 = (Person) person1.clone();

        System.out.println(person1.name + " lives in " + person1.address.city);
        System.out.println(person2.name + " lives in " + person2.address.city);

        // Changing the city in person2 will affect person1 as well
        person2.address.city = "Los Angeles";

        System.out.println(person1.name + " now lives in " + person1.address.city);
        System.out.println(person2.name + " now lives in " + person2.address.city);

        Address55 add = new Address55("asdf");
        Person perso = new Person("sva",add);
        Person perso2 = perso;

        System.out.println(perso == perso2);


    }
}

