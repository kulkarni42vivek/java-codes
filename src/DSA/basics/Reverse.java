package DSA.basics;

public class Reverse {
    public static void main(String[] args) {
        int n = 2545210 ;
        int answer  = 0  ;
        while(n> 0){
            int rem  = n% 10 ;
            answer  = answer *10 + rem ;
            n = n /10 ;
        }
        System.out.println(answer);
    }
}
