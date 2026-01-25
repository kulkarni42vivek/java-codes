package DSA.Array;

import java.util.Scanner;

public class AnyBaseSubtraction {
    static int subtration (int a , int b , int base ){
        int borrow = 0 ;
        int answer = 0 ;
        int multiplier = 1 ;
        while(a>0 || b>0){
            int rem1= a%10;
            int rem2 = b%10;
            int value = rem1 - rem2 - borrow ;
            if(value<0){
                borrow = 1 ;
                value = value + base;
            }
            else{
                borrow = 0;
            }
            answer = answer + value * multiplier;
            a= a/10;
            b = b/10 ;
            multiplier = multiplier*10 ;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int answer = subtration(n1 , n2 , base);
        System.out.println(answer);
    }
}
