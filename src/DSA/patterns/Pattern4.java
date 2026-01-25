package DSA.patterns;

public class Pattern4 {
    public static void main(String[] args) {
        int space =  0 ;
        int stars  = 7  ;
        for(int j=1;j<=7;j++) {
            for(int k = 1; k<= space ; k++){
                System.out.print(" ");
            }
            for (int i = stars; i >= 1; i--) {
                System.out.print("*");
            }
            System.out.println();
            stars--;
            space++;
        }
    }
}
