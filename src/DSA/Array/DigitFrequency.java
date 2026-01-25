package DSA.Array;

import java.util.Scanner;

public class DigitFrequency {
    static int getDigitFrequency(int n , int digit ){
        int count  = 0 ;
        while(n>0){
            int d = n% 10;
            if(d == digit){
                count++ ;
            }
            n = n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = sc.nextInt();
        int answer = getDigitFrequency( n ,  digit);
        System.out.println(answer);
    }
}
