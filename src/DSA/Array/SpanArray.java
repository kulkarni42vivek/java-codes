package DSA.Array;

public class SpanArray {
    public static void main(String[] args) {
        int[] array = new int[]{12,45,14,252,451,11,112,9,78};
        int min = array[0];
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
            if(array[i]>max) {
                max = array[i];
            }
        }
        System.out.println(max - min);
    }
}
