package DSA.patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int n= 5;
        int spaces = n/2 ;
        int stars= 1 ;
        for(int i = 1;i<=n ;i++){
            for(int j= 1;j<=spaces ; j++){
                if(i== n/2+ 1 ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            for(int k =  1 ;k<=stars;k++){
                System.out.print("* ");
            }
            if(i<n/2+1){
                stars++;
            }
            else {
                stars--;
            }
            System.out.println();
        }
    }
}
