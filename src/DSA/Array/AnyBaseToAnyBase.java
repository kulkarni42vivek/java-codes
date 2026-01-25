package DSA.Array;

import java.util.Scanner;

public class AnyBaseToAnyBase {
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
    static int convertToDecimal(int n , int base ){
        int answer = 0 ;
        int power = 0;
        while(n>0){
            int rem = n%10;
            answer = answer + rem * (int)Math.pow(base , power);
            n = n/ 10 ;
            power++;
        }
        return answer ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base1 = sc.nextInt();
        int base2 = sc.nextInt();
        int answer = convertToDecimal( n ,  base1);
        int finalanswer  =  convertToAnyBase(answer , base2);
        System.out.println(finalanswer);
    }
}
