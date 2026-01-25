package DSA.patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int stars = 1 ;
        int spaces = n/2;
        for(int i =1;i<=n;i++){
            for (int j =1;j<=spaces ; j++ ){
                System.out.print(" ");
            }
            for(int k = 1;k<=stars ; k++){
                System.out.print("*");
            }

            if(i< n/2+1){
                spaces -- ;
                stars  = stars + 2 ;
            }
            else{
                spaces++;
                stars = stars - 2 ;
            }
            System.out.println();
        }
    }
}
