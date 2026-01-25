package DSA.Array;

import java.util.Scanner;

public class AnyBaseAddition {

    static int addition (int a , int b , int base ){
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int answer = addition(n1 , n2 , base);
        System.out.println(answer);
    }
}
