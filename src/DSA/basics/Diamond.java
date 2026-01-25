package DSA.basics;
import java.util.*;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = (n);
        for(int i =1;i<=n;i++){

            // spaces
            for(int j= spaces ; j>1;j--){
                System.out.print("_");
            }
            // stars
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }

            System.out.println();
            spaces --;
        }
        int spaces2 = n-1 ;
        for(int i=1;i<=n;i++){
            // spaces
            for(int j=spaces2; j>=1;j-- ){
                System.out.print("=");
            }
            // stars
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
            spaces2--;
        }
    }
}
