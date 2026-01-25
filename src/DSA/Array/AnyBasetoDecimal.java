package DSA.Array;

import java.util.Scanner;

public class AnyBasetoDecimal {
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
        int base = sc.nextInt();
        int answer = convertToDecimal( n ,  base);
        System.out.println(answer);
    }
}
