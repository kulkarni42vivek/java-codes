package DSA.Array;

public class BarChart {
    public static void main(String[] args) {
        int[] array = new int[]{3,1,0,7,5};
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        for(int i = max; i>=1;i--){
            for(int j =0;j<array.length;j++){
                if(array[j]>=i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
