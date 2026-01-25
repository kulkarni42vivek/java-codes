package Java8;

class GenericClass<T>{
    T obj ;
    GenericClass(T obj){
        this.obj = obj;
    }
    T getObjectInfo(){
        return this.obj;
    }
}

class NewClass<T,U> {
    T obj1;
    U obj2;
    NewClass(T objt , U obju){
        obj1 = objt;
        obj2 = obju;
    }
    void getdata(){
        System.out.println(obj1 + " -------- > " + obj2);
    }
}
public class Generics {
    public static void main(String[] args) {
        GenericClass<String> obj = new GenericClass<>("250");
        System.out.println(obj.getObjectInfo());

        GenericClass<Integer> obj2 = new GenericClass<>(45);
        System.out.println(obj2.getObjectInfo());

        NewClass<String , Integer> obj3 = new NewClass<>("one",78);
        obj3.getdata();
    }
}
