package Assignments;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr={10,12,3,15,8,7,81};
		int temp;
   
      for(int i=0;i<arr.length-1;i++) {
    	  for(int j=i+1;j<arr.length;j++) {
    		  if(arr[i]>arr[j]) {
    		  }
    		  temp=arr[i];
    		  arr[i]=arr[j];
    		  arr[j]=temp;

	}

      }
         System.out.println("Second largest element="+arr[1]);  
	}
}

