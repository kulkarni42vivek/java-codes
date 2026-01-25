package DSA.patterns;

import java.util.Scanner;

public class Pattern6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars  = n/2+1;
        int spaces  = 1 ;
        for (int i =1;i<= n;i++){

            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int k = 1;k<=spaces;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=stars;l++){
                System.out.print("*");
            }

            if(i<n/2+1){
                spaces  = spaces+ 2;
                stars --;
            }
            else{
                spaces = spaces - 2;
                stars++;
            }
            System.out.println();
        }
    }
}
