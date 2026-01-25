package DSA.basics;

import java.util.Scanner;

public class PrimeTill {
    static boolean checkIfPrime(int n){
        if(n == 1){
            return false;
        }
        boolean isPrime = true;
        for(int i= 2; i*i<= n ;i++){
            if(n%i ==0){
                isPrime = false ;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int smaller = sc.nextInt();
        int larger = sc.nextInt();
        for(int i=smaller; i<= larger ;i++){
            boolean value = checkIfPrime(i);
            if(value == true){
                System.out.println(i);
            }
        }
    }
}
