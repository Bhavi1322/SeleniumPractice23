package Assignments;

public class PrintArrayElements {
    static void PrintArray(int[]arr) {
	
    	for(int i=0;i<arr.length;i++) {
    		System.out.println(arr[i]+" ");
    	}
    }
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		PrintArray(arr);

	}

}
