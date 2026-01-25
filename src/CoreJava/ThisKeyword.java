package CoreJava;

// 1.this is reference variable which refers to the current object

class One{
    int id ;
    // 3. to invoke default constructor
    One(int id ){
        this();
        this.id = id;
    }

    One(){

        System.out.println("this is default one contructor");
    }

    // 2. this is also used to invoke the current object method
    void getValueMethod(){
        System.out.println("the dummy method");
    }
    void copyMethod(){
        this.getValueMethod();
    }


    void invoke(){

    }
}

class Two{
    int id ;
    String name ;
    String value ;
    String value2;

    Two(int id,String name ){
        this.id = id ;
        this.name = name;
    }
    Two(int id , String name , String value , String value2){
        this(id, name);
        this.value = value ;
        this.value2 = value2;
    }
    // 4.to pass the object
    void Pass(Two obj){
        System.out.println("the object is passed");
    }
    void PassObj(){
       Pass(this);
    }
}

class Three{
    Four obj ;
    Three(Four obj){
        this.obj = obj;
    }
    void display(){
        System.out.println("display method ");
    }

}
class Four{
    Four(){
        Three obj = new Three(this);
        obj.display();
    }
}
class Five{
    Five getObject(){
        return this;
    }
    void display(){
        System.out.println("display method");
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        One one = new One(1);
        one.copyMethod();

        // real usage of this most cases
        Two two = new Two(1,"one");
        Two Objtwo = new Two(1,"two","value","value2");

        Four obj = new Four();

        // returning the object
        new Five().getObject().display();
    }
}
