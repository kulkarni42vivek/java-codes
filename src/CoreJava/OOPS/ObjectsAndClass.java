package CoreJava.OOPS;

class Blue{
    int id ;
    String color;

    public void initializeData(int id , String color){
        this.id = id ;
        this.color = color;
    }

}
// new keyword - assigns memory in the heaps - asigned at the runtime
public class ObjectsAndClass {
    public static void main(String[] args) {
        // initailize via reference
        Blue b = new Blue();
        b.color = "red";
        b.id = 25;

        // via method
        b.initializeData(1,"red");

    }
}
