package DSA.patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int space = 6 ;
        for(int i = 1;i<= 7;i++){
            for(int j = space ;j>=1;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=i ; k++){
                System.out.print("*");
            }
            System.out.println();
            space--;
        }
    }
}
