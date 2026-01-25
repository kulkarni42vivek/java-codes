package CoreJava.OOPS;

interface newInterface{
    public void print();
}
public class AnonymousClass {

    public static void main(String[] args) {
        // anonymous string object
        System.out.println(new String("hello"));

        // anonymous array objects
        for(int i: new int[]{12,45,84,54}){
            System.out.println("i = " + i);
        }

        // anonymous clas
        newInterface obj = new newInterface() {
            @Override
            public void print() {
                System.out.println("hello ");
            }
        };
        obj.print();
    }

}
