package CoreJava.OOPS;
class Bank{
    int getInterest(){
        return 0;
    }
}
class Sbi extends Bank{
    int getInterest(){
        return 10;
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Bank b = new Bank();
        Sbi sbi = new Sbi();
        System.out.println(b.getInterest());
        System.out.println(sbi.getInterest());
        // static method cannot be overriden
    }
}
