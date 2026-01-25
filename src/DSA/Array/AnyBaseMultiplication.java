package DSA.Array;

import java.util.Scanner;

public class AnyBaseMultiplication {
    static int singleMultipliation(int a, int b,int base){
        int answer = 0 ;
        int carry = 0;
        int multiplier = 1 ;
        while(a>0|| carry>0){
            int rem = a%10;
            int value = rem * b + carry ;
            int rem2 = value%base;
            carry = value/base;
            answer = answer + rem2*multiplier;
            a = a/10;
            multiplier = multiplier*10;
        }
        return answer;
    }
    static int anybaseAddtion (int a , int b , int base ){
        int answer = 0 ;
        int carry = 0 ;
        int muliplier = 0;
        while(a>0 || b>0 || carry> 0){
            int rem1 = a%10;
            int rem2 = b%10;
            int value = rem1 + rem2 + carry ;
            carry = value / base ;
            int rem  = value%base ;
            answer = answer +rem *  (int)Math.pow(10,muliplier);
            a= a/10;
            b = b/10;
            muliplier++;
        }
        return answer;
    }
    static int multiply (int a, int b , int base){
        int answer = 0 ;
        int multiplier = 1 ;
        while(b>0){
            int rem = b%10;
            b = b/10;
            int value = singleMultipliation(a,rem,base);
            answer = anybaseAddtion (answer ,value*multiplier, base );
            multiplier = multiplier*10;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int base = sc.nextInt();
        int answer = multiply(n1,n2,base);
        System.out.println(answer);
    }
}
