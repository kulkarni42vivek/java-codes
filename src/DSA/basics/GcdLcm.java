package DSA.basics;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        int a = 36 ;
        int b = 15 ;
        a = Math.max(a,b);
        b = Math.min(a,b);
        while(true){
            int rem = a %b;
            if(rem == 0 ){
                break;
            }
            else{
                a = b ;
                b= rem ;
            }
        }
        System.out.println(b);


        // ------------- another ---------------
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int temp1 = n1;
        int temp2 = n2;

        while (n1 % n2 != 0)
        {
            int remainder = n1 % n2;
            n1 = n2;
            n2 = remainder;
        }
        int gcd = n2;
        int lcm = (temp1 * temp2) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
