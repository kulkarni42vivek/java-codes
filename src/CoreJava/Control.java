package CoreJava;

public class Control {

    public static void main(String[] args) {
        boolean value = false;

        // If statement
        if(value){
            System.out.println(value );
        }

        // If else statement
        if(value){
            System.out.println("nothing");
        }
        else{
            System.out.println("nothing");
        }

        // If - else if - else statement
        if(value){
            System.out.println("one");
        } else if (value) {
            System.out.println("two");
        }
        else {
            System.out.println("three");
        }

        // Switch statement
        int a = 4;
        switch (a) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            default:
                System.out.println("default state");
                break;
        }

        // Loops
        // For loop
        for (int i=0;i<10;i++){
            System.out.println(i);
        }

        // While loop
        int i= 20;
        while (i<10){
            System.out.println(i);
            i--;
        }

        // Do while loop
        do{
            System.out.println(i);
            i--;
        }while (i<10);

        // break and continue statement


        // ternary
        int number = 45;
        String output=(number%2==0)?"even number":"odd number";

        // for each
        for(Integer i2 : new int[]{10, 44, 78, 78, 45}){
            System.out.println(i2);
        }
    }
}
