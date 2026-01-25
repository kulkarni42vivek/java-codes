package DSA.basics;

public class RotateNumber {
    public static void main(String[] args) {
        int number = 278754;
        int k = 14;
        int temp = number ;
        int noOfDigits = 0 ;
        while(temp!=0){
            noOfDigits++;
            temp = temp/10;
        }
        if(k > noOfDigits)
            k = k%noOfDigits;

        int div = 1;
        int mult = 1;
        for (int i = 1; i <= noOfDigits; i++)
        {
            if (i <= k)
                div *= 10;
            else
                mult *= 10;
        }
        int quo = number / div;
        int rem = number % div;
        int r = rem * mult + quo;

        System.out.println(r);
    }
}
