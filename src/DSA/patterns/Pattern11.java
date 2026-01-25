package DSA.patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 1;
        for(int i=1;i<=7;i++){
            for(int j=1;j<=i;j++){
                System.out.print(value+  " ");
                value++;
            }
            System.out.println();
        }
    }
}
