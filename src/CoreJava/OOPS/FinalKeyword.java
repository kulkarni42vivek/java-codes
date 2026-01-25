package CoreJava.OOPS;

// final keyword can be used with the class variable and method. it is used to restrict the user
// for variable - you cannot change the value
// for method - you cannot override it
// for class - you cannot extend it
final class Fifteen{
    final int getvalue(){
        return 15;
    }
}

// blank final variable - it has to instanciated in the constructor only
class Sixteen{
    final int pan;

    Sixteen(int pan) {
        this.pan = pan;
    }
}
class Bike11{
    int cube(final int n){
        //n=n+2;//can't be changed as n is final
        return n*n*n;
    }
}

    public class FinalKeyword {
    public static void main(String[] args) {
        final int value = 78; // final variable
        // value = 77 -- gives the error
    }
}
