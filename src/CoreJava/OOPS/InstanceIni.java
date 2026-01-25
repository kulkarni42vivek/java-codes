package CoreJava.OOPS;
// this is for initializing the instances
// the block is executed while creating the object . all the info in the block is copied in tehe
class Thirteen{
    Thirteen(){
        System.out.println("default constructor");
    }
    {
        System.out.println("this is instance initializwer block");
    }
    static {
    	System.out.println("this is static block");
    }
}
public class InstanceIni {
    public static void main(String[] args) {
        Thirteen obj1 = new Thirteen();
        Thirteen obj2 = new Thirteen();
        Thirteen obj3 = new Thirteen();
    }
}
