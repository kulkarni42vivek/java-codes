package CoreJava;

class One1{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize is called !!");
        super.finalize();
    }
}
public class FinalizeCode {
    public static void main(String[] args) {
        One1 one  = new One1();
        one = null;

    }
}
