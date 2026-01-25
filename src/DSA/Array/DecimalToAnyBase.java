package DSA.Array;

import java.util.Scanner;

public class DecimalToAnyBase {

    static int convertToAnyBase(int n , int base){
        int answer = 0 ;
        int multiplier = 1 ;
        while(n>0){
            int rem = n%base ;
            answer = answer + rem  * multiplier;
            n = n / base ;
            multiplier = multiplier * 10 ;
        }
        return answer ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = sc.nextInt();
        int answer = convertToAnyBase( n ,  base);
        System.out.println(answer);
    }
}
