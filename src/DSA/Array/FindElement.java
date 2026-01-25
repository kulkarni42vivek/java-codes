package DSA.Array;

public class FindElement {
    public static void main(String[] args) {
        int[] array = new int[]{12,45,14,252,451,11,112,9,78};
        int a = 14;
        int pos = -1;
        for(int i=0;i<array.length;i++){
            if(array[i] == a){
                pos = i;
                break;
            }
        }
        System.out.println(pos);
    }
}
