package Assignments;

public class ThirdLargestInarray {

	public static void main(String[] args) {
		int[] arr={1,2,3,5,4,7,8,6};
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
         System.out.println("Third largest element="+arr[2]);  
	}
}
