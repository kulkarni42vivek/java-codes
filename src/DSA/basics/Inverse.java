package DSA.basics;

public class Inverse {
    public static void main(String[] args) {
        int n = 613254 ;//621435
        int answer = 0 ;
        int value = 1;
        while (n> 0){
            int rem = n%10 ;
            answer  = answer + value * ((int)Math.pow(10, rem - 1));
            n =  n / 10 ;
            value++;
        }
        System.out.println(answer);
    }
}
