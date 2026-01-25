package DSA.patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = n/2;
        int stars  = 1;
        int value = 1 ;
        for(int i= 1;i<=n ; i++){

            for(int j =1;j<=spaces ; j++){
                System.out.print(" ");
            }
            int value1 = value ;
            for(int k=1;k<=stars ; k++){

                System.out.print(value1);
                if(k <= stars/2  ){
                    value1 ++ ;
                }
                else{
                    value1 --;
                }
            }

            if(i<n/2+1){
                stars = stars + 2;
                spaces = spaces - 1 ;
                value++ ;
            }
            else{
                stars = stars - 2 ;
                spaces = spaces +1 ;
                value--;
            }
            System.out.println();
        }
    }
}
