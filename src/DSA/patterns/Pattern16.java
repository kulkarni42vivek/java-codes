package DSA.patterns;

public class Pattern16 {
    public static void main(String[] args) {
        int n = 7 ;

        int spaces = 2*n-3  ;
        int stars =  1 ;
        for(int i = 1 ;i<= 7 ;i++){
            int value =  1;
            for(int j = 1 ;j<= stars ; j++){
                System.out.print(value);
                value++ ;
            }
            for(int j = 1;j<= spaces ; j++){
                System.out.print(" ");
            }

            if(i==n){
                value-- ;
                stars -- ;
            }
            for(int k = 1 ;k<= stars ; k++){
                value--;
                System.out.print(value);

            }
            System.out.println();
            stars++;
            spaces =  spaces-2 ;
        }
    }
}
