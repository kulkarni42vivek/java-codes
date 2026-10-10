package CoreJava.ExceptionHandling;

class CustomE extends Exception{
    public CustomE(String value){
        super("Custom exception called !" + value);
    }
}

public class CustomException {
    public static void main(String[] args) throws CustomE {
        try{
            int value  = 10/0 ;
        }
        catch(Exception e){
            throw new CustomE("value");
        }
    }
}
