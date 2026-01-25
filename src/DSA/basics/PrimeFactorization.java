package DSA.basics;

public class PrimeFactorization {
    public static void main(String[] args) {
        int a = 1440 ;
        for(int i = 2 ; i*i<= a ; i++ ){
            while(a%i==0){
                System.out.print(i + " ");
                a= a/i;
            }
        }
        if (a !=0){
            System.out.print(a);
        }
        System.out.println();
    }
}
