package CoreJava;

import java.util.Scanner;

public class ArrayClass {
    static int[] methodPassing(int[] a){
        System.out.println(a[0]);
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 25;
        array[1] = 45;
        array[2] = 45;
        array[3] = 14;
        array[4] = 52;
        System.out.println(array);
        for(int i =0;i<array.length ; i++){
            System.out.println(array[i]);
        }
        int[] arr = {12,14,54};
        for(int i: arr){
            System.out.println(i);
        }
        int[] b = methodPassing(arr);
        System.out.println(b);

        int[][] c = new int[][]{{1,2,3},{2,4,5},{4,4,5}};
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        // jagged array
        int [][] d= new int[3][];
        for(int i=0;i<d.length ; i++){
            int value = sc.nextInt();
            d[i] = new int[value];
            for(int j=0;j<d[i].length;j++){
                d[i][j] = j;
            }
        }
        for(int i =0;i<d.length;i++){
            for(int j=0;j<d[i].length;j++){
                System.out.print(d[i][j]);
            }
            System.out.println();
        }
        // array is object in the java
        int[] e = b.clone();
        System.out.println(e);
    }


}
