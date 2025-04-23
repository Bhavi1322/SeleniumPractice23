package packageday15arraysexamples;

import java.util.Arrays;

public class M_Array {
	//java program to clone the array
	public static void main(String[] args) {
		int array[]= {33,3,4,5};
		System.out.println("Printing original array:");
		for(int i:array) {
			System.out.print(i+" ");//33,3,4,5}
		}
      System.out.println("\nPrinting clone of the array:");
      int cloneArray[]=array.clone();
      for(int i:cloneArray) {
    	  System.out.print(i+" ");//33,3,4,5}
      }
      System.out.println("\nAre both equal arr & carr?"); 
      System.out.println("array & cloneArray content validation:"+Arrays.equals(array,cloneArray, null));
      System.out.println("*************************");
      int newCopiedArray[]=Arrays.copyOf(array, array.length);//{33,3,4,5}
      for(int i:newCopiedRangeArray) {
    	  System.out.print(i+" ");
    	  System.out.println("\nComparing newCopiedRangeRangArray & newCopiedArray:"+Arrays.equals(newCopiedArray));
    	  System.out.println("*************************************");
    	  Arrays.sort(array);//sort the array elements in ascending order and stores the sorted element inthe same array
    	  System.out.println("After sorting original array:");
    	  for(int i:array) {
    		  System.out.println(i+" ");//3 4 5 33
    	  }
      }
}
}