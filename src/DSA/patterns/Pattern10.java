package DSA.patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inner = -1;
        int outer = n/2;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=outer;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k =1;k<=inner;k++){
                System.out.print(" ");
            }
            if(i!=1 && i!=n)
            System.out.print("*");
            System.out.println();
            if(i<n/2+1){
                inner = inner+2;
                outer = outer-1;
            }
            else{
                inner = inner-2;
                outer = outer+1;
            }
        }
    }
}
