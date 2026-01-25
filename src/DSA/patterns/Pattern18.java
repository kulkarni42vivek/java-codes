package DSA.patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 7 ;
        int stars = n ;
        int space = 0;
        for(int i =01;i<=n;i++){

            for(int j =1;j<=space; j++  ){
                System.out.print(" ");
            }

            for (int k = 1;k<=stars ; k++){
                if(i>1 && i<=n/2 && k>1 && k<stars){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }

            if(i<n/2+1){
                stars = stars - 2;
                space = space + 1;
            }
            else{
                stars = stars + 2;
                space = space - 1;
            }
            System.out.println();
        }
    }
}
