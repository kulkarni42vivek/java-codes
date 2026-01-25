//package OOPS;
//
//class Address2 implements Cloneable {
//    String city;
//
//    public Address2(String city) {
//        this.city = city;
//    }
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();  // Deep clone for Address
//    }
//}
//
//class Person2 implements Cloneable {
//    String name;
//    Address2 address;  // Nested object
//
//    public Person2(String name, Address2 address) {
//        this.name = name;
//        this.address = address;
//    }
//
//    // Deep copy by cloning nested objects
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Person2 clonedPerson = (Person2) super.clone();
//        clonedPerson.address = (Address2) this.address.clone();  // Clone the Address object too
//        return clonedPerson;
//    }
//}
//
//public class DeepCopyExample {
//    public static void main(String[] args) throws CloneNotSupportedException {
//        Address address = new Address("New York");
//        Person person1 = new Person("John", address);
//
//        // Deep copy of person1
//        Person person2 = (Person) person1.clone();
//
//        System.out.println(person1.name + " lives in " + person1.address.city);
//        System.out.println(person2.name + " lives in " + person2.address.city);
//
//        // Changing the city in person2's address won't affect person1's address
//        person2.address.city = "Los Angeles";
//
//        System.out.println(person1.name + " still lives in " + person1.address.city);
//        System.out.println(person2.name + " now lives in " + person2.address.city);
//    }
//}
//
package CoreJava.OOPS;


