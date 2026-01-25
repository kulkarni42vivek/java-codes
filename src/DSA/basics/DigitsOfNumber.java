package DSA.basics;

public class DigitsOfNumber {
    public static void main(String[] args) {
        int n = 5426213;
        int temp = n ;
        int noOfDig = 0 ;
        while(temp!=0){
            noOfDig++;
            temp = temp/10;
        }
        int div = (int)Math.pow(10, noOfDig - 1);
        while(n!=0){
            int dig = n / div ;
            System.out.print(dig + " ");
            n = n%div;
            div = div/10;
        }

        System.out.println();

        int n1 = 78784;
        String number = Integer.toString(n1) ;
        for(int j = 0 ;j< number.length() ; j++){
            System.out.print(number.charAt(j));
        }
    }
}
