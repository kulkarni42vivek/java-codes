package DSA.Array;


public class ArrayAddition {
    public static void main(String[] args) {
        int[] a1 = new int[]{ 3, 1, 0, 7, 5 };
        int[] a2 = new int[]{ 1, 1, 1, 1, 1, 1 };
        int n1 = a1.length-1;
        int n2 = a2.length-1;
        int carry = 0;
        int [] answer = new int[Math.max(n1+1,n2+1)];
        int answerLength = answer.length-1;
        int value = 0 ;
        while(n1>=0 || n2>=0){
            value = carry;
            if(n1>=0){
                value = value + a1[n1];
            }
            if(n2>=0){
                value = value + a2[n2] ;
            }
            int rem = value%10;
            carry  = value/10;
            answer[answerLength] = rem;
            n1--;
            n2--;
            answerLength--;
        }
        for(int i: answer){
            System.out.print(i+" ");
        }
    }
}
