package CoreJava;

public class ArrayBasic {
	
	public static int[] passingArray(int[] array) {
		array[0] = 10; 
		return array;
	}
	
	public static void passingArrayTwo(int[] array) {
		array[0] = 25 ; 
	}
	
	public static void main(String[] args) {
		
		// Basic java array example 
		
		int[] array = new int[4];
		
		array[0] = 5;
		array[1] = 6;
		array[3] = 7 ; 
		
		System.out.println(" array field at poisitin o " + array[0]);
		System.out.println(" array object " + array);
		
		for(int i = 0 ;i< array.length ; i++) {
			System.out.println(array[i]);
		}
		
		// Enhanced for loop
		for(int i : array) {
			System.out.println("enhanced -->> " + i );
		}
		
		String[] arrayString = new String[] {"test","test2","test3"};
		System.out.println(arrayString[2]);
		
		
		// Two dimensional array and jagged array 
		
		int[][] arrayTwo = new int[2][2];
		arrayTwo[0][0] = 10;
		arrayTwo[0][1] = 12;
		arrayTwo[1][0] = 13;
		arrayTwo[1][1] = 25 ; 
		
		// Two dimensional array traversal 
		for(int i = 0 ;i< arrayTwo.length ;i++) {
			for(int j=0;j<arrayTwo[i].length;j++) {
				System.out.print(arrayTwo[i][j] + " ");
			}
			System.out.println();
		}
		
		
		// Jagged array 
		int [][] jaggedArray = new int[2][];
        for(int i=0;i<jaggedArray.length ; i++){
            int value = 3;
            jaggedArray[i] = new int[value];
            for(int j=0;j<jaggedArray[i].length;j++){
            	jaggedArray[i][j] = j;
            }
        }
        
        
        // Array method testing 
        int[] returnedArray = passingArray(array);
        
    	for(int i = 0 ;i< array.length ; i++) {
			System.out.println("original array --> "  + array[i]);
		}
    	
    	for(int i = 0 ;i< returnedArray.length ; i++) {
    		System.out.println("transformed array --> " +returnedArray[i]);
		}
    	
    	passingArrayTwo(array);
    	System.out.println("transformed value --> " +array[0]);
		
	}
}
